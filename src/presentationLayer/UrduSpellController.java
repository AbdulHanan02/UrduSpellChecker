package presentationLayer;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import businessLayer.MutantGenerator;
import businessLayer.SeperateWords;
import businessLayer.UrduSpellModel;
import databaseLayer.DatabaseAccess;

public class UrduSpellController {
	UrduSpellModel model;
	UrduSpellView view;
	ManualAdd view2;
	ArrayList<String> wordsList = new ArrayList<String>();

	/**
	 * 
	 * @author Abdullah
	 */
	public UrduSpellController(UrduSpellModel m, UrduSpellView v, ManualAdd v2) {
		model = m;
		view = v;
		view2 = v2;
	SeperateWords objS = new SeperateWords();
		objS.setFileData();
		objS.sepWords();
		MutantGenerator mu = new MutantGenerator();
		mu.GenerateAndStore();
		v.setVisible(true);
	}

	/**
	 * @author Abdullah notifies the action listener whenever button is pressed.
	 */
	public void getStartController() {
		view.getBtnNewButton().addActionListener(e -> {
			String line = view.getTextArea().getText();
			actionOnButton(line);

		});
		view.getBtnNewButton_1().addActionListener(e -> {
			view2.setVisible(true);
			view2.getBtnNewButton().addActionListener(e1 -> {
				String word = view2.getTextField().getText();
				insertNewWord(word);
			});
			
		});
	}

	private void insertNewWord(String word) {
		
		DatabaseAccess objD = new DatabaseAccess();
		objD.insertWord(word, 1);
		view2.setVisible(false);
		
	}

	/**
	 * 
	 * @author Abdullah Provides functionality when clicked upon "Check Statement"
	 *         button and highlights the incorrect word or sentence
	 */
	private void actionOnButton(String line) {
		wordsList = model.GetWordsListFromDB();
		if (wordsList == null) {
			System.out.println("Database word list is empty");
		}
		line += " ";
		String[] words = line.split(" ");
		String WrongNewLine = "";
		ArrayList<String> wrongWords = model.verifyWords(wordsList, words);
		for (int i = 0; i < wrongWords.size(); i++) {
			String string = wrongWords.get(i);
			WrongNewLine += string + " ";

		}
		view.getTextArea_1().setText(WrongNewLine);
		Highlighter high = view.getTextArea_1().getHighlighter();
		high.removeAllHighlights();
		HighlightPainter y = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
		try {
			high.addHighlight(0, WrongNewLine.length(), y);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
