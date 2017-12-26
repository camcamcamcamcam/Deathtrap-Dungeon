
public class Methods {

	public static int[] pages;

	public static void choosePath(String[] options) {
		for (int i = 0; i < 4; i++) {
			Window.frame.getContentPane().add(Window.choices[i], Window.gbc_choices[i]);
			Window.frame.getContentPane().remove(Window.choices[i]);
		}
		for (int i = 0; i < options.length; i++) {
			Window.frame.getContentPane().add(Window.choices[i], Window.gbc_choices[i]);
		}
		for (int i = 0; i < options.length; i++) {
			Window.choices[i].setText(options[i]);
		}
	}
}
