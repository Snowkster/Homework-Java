package com.chessmaster.config;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.chessmaster.manager.GameBoard;

public class UndoRendoController<GameBoardChessFiguerManager> implements ActionListener, KeyListener{

	private GameBoard board;
	private GameBoardChessFiguerManager view;
	private Color WhitePlayer;
	private Color BlackPlayer;
	
	void AddBottons() {
		view.pnRecord.btnRedo.addActionListener(this);
		view.pnRecord.btnRedo.addKeyListener(this);
		view.pnRecord.btnUndo.addActionListener(this);
		view.pnRecord.btnUndo.addKeyListener(this);
	}
	
	public void record(GameBoard move) {
		
		if (move != null) {
			String player = "";
			if (WhitePlayer == Color.WHITE) {
				player = "Player1: ";
			}else if(BlackPlayer == Color.BLACK) {
				player = "Player2: ";
			}
		}
		
		}
	
	public void removeRecord(GameBoard move) {
		if (move != null) {
			view.remove();
			GameBoard.repaint();
		}
	}

	void undo() {
		removeRecord(action.undo());
	}

	void redo() {
		addRecord(action.redo());
	}
	
	@Override
	public void keyPressed(KeyEvent m) {
		
			if (m.getKeyCode() == KeyEvent.VK_U) {
				action.undo();
				return;
			}
			
			if (m.getKeyCode() == KeyEvent.VK_R) {
				action.redo();
				return;
			}
			
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.rendo()) {
			System.out.println("redo");
			action.redo();
			return;
		}
		
		if (e.getSource() == view.undo()) {
			System.out.println("undo");
			action.undo();
			return;
		}

		
	}
	
	
	}

	
}
