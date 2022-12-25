package cz.cvut.fit.adametim.bi_tjv.semester_project.api

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ClientDto
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.ClientService
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.exceptions.EntityStateException
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ClientControllerIntegrationTest(
    @Autowired
    val clientController: ClientController,
    @Autowired
    val clientService: ClientService,
) {

    @Test
    fun testUpdateExists() {
        val client = Client(0, "DummyName")
        clientService.create(client)
        val dto = ClientDto(50, "DummyName")
        Assertions.assertThrows(EntityStateException::class.java) {
            clientController.update(
                dto, dto.clientId
            )
        }
    }
}
