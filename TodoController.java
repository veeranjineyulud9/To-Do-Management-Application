package in.vtech.springboot.web.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	// http://localhost:8081/list-todos => listTodos.jsp
//	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//	public String gotoListTodosPage() {
//		return "listTodos1";
//	}

	// http://localhost:8081/list-todos => listTodos.jsp
//		@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//		public String gotoListTodosPage() {
//			return "listTodos2";
//		}

	// http://localhost:8081/list-todos => listTodos.jsp
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String gotoListTodosPage(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("vtech");
		model.put("todos", todos);

		return "listTodos3";
	}
}
