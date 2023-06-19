public class BuyMenuMain {
	public static void main(String[] args) {

		// DONE: add an icon to each of our gun menus
		// DONE: add sound effects of when a user clicks on a JButton

		/*
		 * DEVELOPER NOTE (6/18/23):
		 * When exporting in vscode, it export all of the files without
		 * any sort of configuration so that all the resources are included
		 * in the jar file. This makes exporting and sharing Java project
		 * files easier since it means that the user does not need to use
		 * eclipse to run the file and that more people should be able to
		 * run the raw files.
		 */

		/*
		 * DEVELOPER NOTE (6/19/23)
		 * Apparently, I still need to use URL objects so that the jar file could
		 * properly be exported with its resources.
		 */

		// TODO: create URL objects for all of our icons and photos in our menus
		BuyMenuFrame mainProgram = new BuyMenuFrame();
		mainProgram.createBuyMenuFrame();
		mainProgram.menuBackgroundAudio();

	}

}