/** ... **/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import javax.swing.*;

/**
 * Project3.java - GUI implementation of Stacks, Queues, Lists
 * @author Emmanuel Edamwen
 * @version 1.0
 * @since 11/2/18
 */


public class Project3 extends JFrame{

    /**
     * @tabs - creates 3 tabs
     * @stackofThings - creates stack
     * @stackStr - string of stack
     * @queue - creates queue
     * @queueStr - string of queue
     * @list - creates list
     * @lStr - string of list
     */

    private JTabbedPane tabs;

    private Stack<String> stackofThings = new Stack<>();
    private String stackStr;

    private Queue<String> queue = new LinkedList<>();
    private String queueStr = queue.toString();
    private List<String> list = new ArrayList<>();
    private String lStr = new String();

    public Project3(){

        /**
         * All the panels, labels, text field needed for the Stack tab
         */

        JPanel stackPanel = new JPanel();
        JLabel stackLb = new JLabel();
        JLabel stack = new JLabel();
        JTextField data = new JTextField("", 30);
        JLabel sPrint = new JLabel();
        JPanel buttons = new JPanel();
        JPanel input = new JPanel();
        JPanel output = new JPanel();

        /**
         * Creates panel and label of queue tab
         */

        JPanel qPanel = new JPanel();
        JLabel qLabel = new JLabel();

        /**
         * Creates panel and label of the list tab
         */

        JPanel listPanel = new JPanel();
        JLabel listLb = new JLabel();

        //Adds tabs to top of the frame
        tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        /**
         * Creates and initializes all the necessary buttons
         */

        JPanel qButtons = new JPanel();
        Button enque = new Button();
        enque.setLabel("enque");
        Button deque = new Button();
        deque.setLabel("deque");
        Button front = new Button();
        front.setLabel("front");
        Button qisEmpty = new Button();
        qisEmpty.setLabel("isEmpty");
        Button qtoString = new Button();
        qtoString.setLabel("toString");

        JPanel lButtons = new JPanel();
        Button clear = new Button();
        clear.setLabel("clear");
        Button listAdd = new Button();
        listAdd.setLabel("add");
        Button lisEmpty = new Button();
        lisEmpty.setLabel("isEmpty");
        Button ltoString = new Button();
        ltoString.setLabel("toString");
        Button lSize = new Button();
        lSize.setLabel("size");
        Button remove = new Button();
        remove.setLabel("removeObj");

        lButtons.add(listAdd);
        lButtons.add(clear);
        lButtons.add(lisEmpty);
        lButtons.add(ltoString);
        lButtons.add(remove);
        lButtons.add(lSize);

        JButton push = new JButton();
        JButton pop = new JButton();
        JButton peek = new JButton();
        JButton isEmpty = new JButton();
        JButton size = new JButton();
        JButton toString = new JButton();

        qButtons.add(enque);
        qButtons.add(deque);
        qButtons.add(front);
        qButtons.add(qisEmpty);
        qButtons.add(qtoString);

        buttons.add(push);
        buttons.add(peek);
        buttons.add(pop);
        buttons.add(isEmpty);
        buttons.add(size);
        buttons.add(toString);

        push.setSize(50, 50);
        push.setText("push");
        pop.setSize(50, 50);
        pop.setText("pop");
        peek.setSize(50, 50);
        peek.setText("peek");
        isEmpty.setText("isEmpty");
        size.setText("size");
        toString.setText("toString");

        //Add the tabs and panels

        tabs.addTab("Stacks", stackPanel);
        tabs.addTab("Queue", qPanel);
        tabs.addTab("Lists", listPanel);

        //Fill stack with items
        stackofThings.push("Hello");
        stackofThings.push("Testing");
        stackofThings.push("Stacks");
        stackofThings.push("Woooooooow!!!");

        //Fill queue with items
        queue.add("Testing");
        queue.add("Hello");
        queue.add("Nice Queue");

        //Fill list with items
        list.add("Now for list");
        list.add("I love Anime!");
        list.add("... and video games");

        /**
         * Creates a label to show results on new stack, queue, list,
         * Creates textfields for user to enter data
         * Creates another label to print other results
         */
        JLabel lLabel = new JLabel();
        JTextField ltxtField = new JTextField("", 30);
        JLabel lPrint = new JLabel();

        JTextArea qText = new JTextArea();
        JTextField qEntry = new JTextField("", 30);
        JLabel qPrint = new JLabel();

        lStr = list.toString();
        lLabel.setText(lStr);

        queueStr = queue.toString();
        qLabel.setText(queueStr);

        qText.setSize(50, 50);
        qText.setVisible(true);

        stackStr = stackofThings.toString();
        stack.setText(stackStr);

        /**
         * @push - adds item to the stack
         * @pop - removes last item from the stack
         * @peek - checks first item in stack
         * @isEmpty - checks if stack is empty
         * @size - checks stack size
         * @toString - prints String of stack
         */
        push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stackofThings.push(data.getText());
                stackStr = stackofThings.toString();
                stack.setText(stackStr);
            }
        });
        pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stackofThings.pop();
                stackStr = stackofThings.toString();
                stack.setText(stackStr);
            }
        });
        peek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sPrint.setText(stackofThings.peek());
            }
        });
        isEmpty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strb = String.valueOf(stackofThings.isEmpty());
                sPrint.setText(strb);
            }
        });
        size.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = stackofThings.size();
                String strwa = String.valueOf(size);
                sPrint.setText(strwa);
            }
        });
        toString.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sPrint.setText(stackStr);
            }
        });



        enque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queue.add(qEntry.getText());
                queueStr = queue.toString();
                qLabel.setText(queueStr);
            }
        });
        deque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queue.remove();
                queueStr = queue.toString();
                qLabel.setText(queueStr);
            }
        });
        front.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String peeked = queue.peek();
                qPrint.setText(peeked);
            }

        });
        qisEmpty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sqstr = String.valueOf(queue.isEmpty());
                qPrint.setText(sqstr);
            }
        });
        qtoString.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                qPrint.setText(queueStr);
            }
        });


        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.clear();
                lLabel.setText(list.toString());
            }
        });
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.remove(ltxtField.getText());
                lStr = list.toString();
                lLabel.setText(lStr);
            }
        });
        lisEmpty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lPrint.setText(String.valueOf(list.isEmpty()));
            }
        });
        listAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.add(ltxtField.getText());
                lStr = list.toString();
                lLabel.setText(lStr);
            }
        });
        lSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lSize = list.size();
                lPrint.setText(String.valueOf(lSize));
            }
        });
        ltoString.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lPrint.setText(lStr);
            }
        });

        /**
         * Adds and layouts all the content to the panels, frame
         */

        input.add(data);
        output.add(stack);

        getContentPane().add(tabs);

        stackPanel.add(buttons, BorderLayout.NORTH);
        stackPanel.add(output, BorderLayout.CENTER);
        stackPanel.add(input, BorderLayout.PAGE_END);
        stackPanel.add(stack, BorderLayout.SOUTH);
        stackPanel.add(stackLb);
        stackPanel.add(sPrint);

        qPanel.add(qButtons, BorderLayout.NORTH);;
        qPanel.add(qEntry, BorderLayout.LINE_START);
        qPanel.add(qLabel, BorderLayout.SOUTH);
        qPanel.add(qPrint);

        listPanel.add(listLb);
        listPanel.add(lButtons, BorderLayout.NORTH);
        listPanel.add(ltxtField, BorderLayout.CENTER);
        listPanel.add(lLabel, BorderLayout.SOUTH);
        listPanel.add(lPrint);

        /**
         * Making it so windodw can't be resized, setting size, making visible true
         */
        setResizable(false);
        setSize(800, 600);
        setVisible(true);
    }
}