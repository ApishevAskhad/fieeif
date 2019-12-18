package ru.apishev.askhad.controller

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@TestInstance(Lifecycle.PER_CLASS)
internal class WebControllerTest {
    private lateinit var mvcMock: MockMvc
    private lateinit var webController: WebController

    @BeforeAll
    internal fun init() {
        webController = WebController()
        mvcMock = MockMvcBuilders.standaloneSetup(webController).build()
    }

    @Test
    fun `should display header text`() {
        mvcMock.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(view().name("index"))
                .andDo(MockMvcResultHandlers.print())
    }
}
