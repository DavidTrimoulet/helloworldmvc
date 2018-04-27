package helloworldmvc.main;
import helloworldmvc.controller.ChevreExeption;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		Model model = new Model();
		Controller ctrl = new Controller(view, model);
		try {
			ctrl.run();
		} catch (ChevreExeption e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
