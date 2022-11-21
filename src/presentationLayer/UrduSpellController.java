package presentationLayer;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import businessLayer.UrduSpellModel;

public class UrduSpellController {
	UrduSpellModel model;
	UrduSpellView view;
	ArrayList<String> wordsList=new ArrayList<String>();
	
	
	public UrduSpellController(UrduSpellModel m, UrduSpellView v) {
		model = m;
		view = v;
	}

	public void getStartController() {
		view.getBtnNewButton().addActionListener(e -> {
			String line=view.getTextArea().getText();
			actionOnButton(line);

		});
	}

	private void actionOnButton(String line) {
		wordsList=model.GetWordsListFromDB();
		if(wordsList==null) {
			System.out.println("Word list from database is empty");
		}
		line+=" ";
		String [] words=line.split(" ");
		String WrongNewLine="";
		ArrayList<String> wrongWords=model.checkWords(wordsList,words);
		for (int i = 0; i < wrongWords.size(); i++) {
			String string = wrongWords.get(i);
			WrongNewLine+=string+" ";
			
		}
		view.getTextArea_1().setText(WrongNewLine);
		Highlighter high = view.getTextArea_1().getHighlighter();
		high.removeAllHighlights();
		HighlightPainter y = new DefaultHighlighter.DefaultHighlightPainter(Color.red);
		try {
			high.addHighlight(0,WrongNewLine.length() , y);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
