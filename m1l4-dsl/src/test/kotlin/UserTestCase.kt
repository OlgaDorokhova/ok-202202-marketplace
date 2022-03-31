import org.junit.Test
import user.dsl.user
import user.models.Action
import kotlin.test.assertEquals

class UserTestCase {
				@Test
				fun `test user`() {
								val user = user {
												name {
																first = "Name"
																last = "Surname"
												}
												contacts {
																email = "email@mail.com"
																phone = "89062349876"
												}
												actions {
																add(Action.UPDATE)
																add(Action.ADD)
																+Action.DELETE
																+Action.READ
												}
												availability {
																monday("11:30")
																friday("18:00")
												}
								}
								assertEquals("Name", user.firstName)
				}
}