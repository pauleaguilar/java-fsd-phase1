package org.example.virtualkey.screens;

import java.util.Scanner;
import org.example.virtualkey.services.DirectoryService;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class WelcomeScreen implements Screen {

	public String getWelcomeText() {
		return welcomeText;
	}

	private String welcomeText = "Welcome to the VirtualKey";
	private String developerName = "Developer: Paul Aguilar";
	
	public String getDeveloperName() {
		return developerName;
	}

	private String selectOption = "Choose your option:\n";
	
	private ArrayList<String> options = new ArrayList<>();

	public WelcomeScreen() {
		options.add("1. Show Files. ");
		options.add("2. Show File Options. ");
		options.add("3. Quit. ");
	}
	
	
	@Override
	public void Show() {
		System.out.println(selectOption);

		for (String s : options) {
			System.out.println(s);
		}

	}

	public void GetUserInput() {
		int selectedOption = this.getOption();
		this.NavigateOption(selectedOption);
	}

	@Override
	public void NavigateOption(int option) {
		switch (option) {
		case 1:
			this.ShowFiles();
			break;
		case 2:
			FileOptionsScreen fs = new FileOptionsScreen();
			fs.Show();
			fs.GetUserInput();
			break;
		case 3:
			closeApp();
			break;
		default:
			System.out.println("Invalid Option.");
			break;
		}
	}

	public void ShowFiles() {
		System.out.println("Current files in the folder.\n");
		DirectoryService.ViewFolder();
	}

	private String getInputString() {
		Scanner input = new Scanner(System.in);
		return (input.nextLine());

	}

	private int getOption() {
		int option = 0;
		try {
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
		} catch (InputMismatchException ime) {
		}
		return option;
	}

	public static void closeApp() {
		System.err.println("\nYour application is closing... \nThank you!");
		System.exit(0);
	}

}
