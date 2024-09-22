import javax.swing.*;   // For JFrame, JMenuBar, JMenu, JMenuItem, JComboBox, etc.
import java.awt.*;      // For BorderLayout, JPanel, etc.
import java.awt.event.*; // For ActionListener

public class SimpleGUI extends JFrame {
    
    // Constructor to setup the GUI components
    public SimpleGUI() {
        // Set the title of the JFrame
        setTitle("Simple GUI with Menubar, Toolbar, and ComboBox");
        
        // Set the size of the JFrame
        setSize(400, 300);
        
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Call method to create and add the menu bar
        createMenuBar();

        // Call method to create and add the toolbar
        createToolBar();
        
        // Call method to create and add the combobox
        createComboBox();

        // Set the layout for the content pane
        setLayout(new BorderLayout());

        // Make the frame visible
        setVisible(true);
    }
    
    // Method to create the MenuBar
    private void createMenuBar() {
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        
        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        // Add action listener for "Exit" menu item
        exitItem.addActionListener(e -> System.exit(0));

        // Add menu items to the File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();  // Add a separator line
        fileMenu.add(exitItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        // Set the menu bar to the frame
        setJMenuBar(menuBar);
    }
    
    // Method to create the ToolBar
    private void createToolBar() {
        // Create a toolbar
        JToolBar toolBar = new JToolBar();
        
        // Create buttons for the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add buttons to the toolbar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);
        
        // Add the toolbar to the frame (North position)
        add(toolBar, BorderLayout.NORTH);
    }

    // Method to create the ComboBox
    private void createComboBox() {
        // Create a label
        JLabel comboBoxLabel = new JLabel("Choose an option: ");

        // Create a ComboBox with options
        String[] options = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> comboBox = new JComboBox<>(options);
        
        // Add action listener to capture selected item
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null, "You selected: " + selectedItem);
            }
        });

        // Create a panel for layout
        JPanel panel = new JPanel();
        panel.add(comboBoxLabel);
        panel.add(comboBox);
        
        // Add the panel to the frame (Center position)
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleGUI class
        new SimpleGUI();
    }
}
