import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class StudentInformationSystem extends JFrame implements ActionListener {

    private JTextField nameInput, idInput, courseInput, phoneInput;
    private JComboBox<String> genderSelect;
    private JTextArea outputArea;
    private JButton addBtn, updateBtn, removeBtn, showBtn, resetBtn;

    private final ArrayList<Student> studentList = new ArrayList<>();

    public StudentInformationSystem() {
        setTitle("Student Information System");
        setSize(470, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 8, 8));
        formPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        "Enter Details",
                        0, 0,
                        new Font("Arial", Font.BOLD, 19)
                ),
                BorderFactory.createEmptyBorder(30, 20, 10, 20) // adds space between title & fields
        ));

        Font labelFont = new Font("Arial", Font.PLAIN, 17);

        formPanel.add(makeLabel("Name:", labelFont));
        nameInput = makeField();
        formPanel.add(nameInput);

        formPanel.add(makeLabel("ID:", labelFont));
        idInput = makeField();
        formPanel.add(idInput);

        formPanel.add(makeLabel("Course:", labelFont));
        courseInput = makeField();
        formPanel.add(courseInput);

        formPanel.add(makeLabel("Phone:", labelFont));
        phoneInput = makeField();
        formPanel.add(phoneInput);

        formPanel.add(makeLabel("Gender:", labelFont));
        genderSelect = new JComboBox<>(new String[]{"Select", "Male", "Female", "Other"});
        genderSelect.setFont(new Font("Arial", Font.PLAIN, 13));
        genderSelect.setPreferredSize(new Dimension(120, 25));
        formPanel.add(genderSelect);

        // === BUTTONS SECTION ===
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Font btnFont = new Font("Arial", Font.BOLD, 13);

        addBtn = makeButton("Add", btnFont);
        updateBtn = makeButton("Edit", btnFont);
        removeBtn = makeButton("Delete", btnFont);
        showBtn = makeButton("View All", btnFont);
        resetBtn = makeButton("Clear", btnFont);

        buttonPanel.add(addBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(removeBtn);
        buttonPanel.add(showBtn);
        buttonPanel.add(resetBtn);

        // === OUTPUT AREA ===
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setBorder(BorderFactory.createTitledBorder("Student Records"));

        // === FRAME LAYOUT ===
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        // === BUTTON ACTIONS ===
        addBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        removeBtn.addActionListener(this);
        showBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setVisible(true);
    }

    // --- helper functions ---
    private JLabel makeLabel(String text, Font font) {
        JLabel label = new JLabel(text);
        label.setFont(font);
        return label;
    }

    private JTextField makeField() {
        JTextField field = new JTextField(10);
        field.setFont(new Font("Arial", Font.PLAIN, 13));
        field.setPreferredSize(new Dimension(120, 25));
        return field;
    }

    private JButton makeButton(String text, Font font) {
        JButton btn = new JButton(text);
        btn.setFont(font);
        btn.setPreferredSize(new Dimension(85, 28));
        return btn;
    }

    // --- main logic ---
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == addBtn) addStudent();
        else if (src == updateBtn) editStudent();
        else if (src == removeBtn) deleteStudent();
        else if (src == showBtn) showStudents();
        else if (src == resetBtn) clearForm();
    }

    private void addStudent() {
        if (!validateForm()) return;
        studentList.add(new Student(
                nameInput.getText(),
                idInput.getText(),
                courseInput.getText(),
                phoneInput.getText(),
                genderSelect.getSelectedItem().toString()
        ));
        JOptionPane.showMessageDialog(this, "Student added successfully!");
        clearForm();
    }

    private void editStudent() {
        String id = idInput.getText().trim();
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                s.setName(nameInput.getText());
                s.setCourse(courseInput.getText());
                s.setPhone(phoneInput.getText());
                s.setGender(genderSelect.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Record updated!");
                clearForm();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Student ID not found.");
    }

    private void deleteStudent() {
        String id = idInput.getText().trim();
        boolean removed = studentList.removeIf(s -> s.getId().equals(id));
        JOptionPane.showMessageDialog(this, removed ? "Record deleted." : "Student not found.");
        clearForm();
    }

    private void showStudents() {
        if (studentList.isEmpty()) {
            outputArea.setText("No student records available.");
            return;
        }
        StringBuilder info = new StringBuilder("Student Records:\n\n");
        for (Student s : studentList) {
            info.append("Name: ").append(s.getName())
                .append("\nID: ").append(s.getId())
                .append("\nCourse: ").append(s.getCourse())
                .append("\nPhone: ").append(s.getPhone())
                .append("\nGender: ").append(s.getGender())
                .append("\n---------------------------\n");
        }
        outputArea.setText(info.toString());
    }

    private void clearForm() {
        nameInput.setText("");
        idInput.setText("");
        courseInput.setText("");
        phoneInput.setText("");
        genderSelect.setSelectedIndex(0);
        outputArea.setText("");
    }

    private boolean validateForm() {
        if (nameInput.getText().isEmpty() || idInput.getText().isEmpty()
                || courseInput.getText().isEmpty() || phoneInput.getText().isEmpty()
                || genderSelect.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new StudentInformationSystem();
    }
}

// === Student Class ===
class Student {
    private String name, id, course, phone, gender;

    public Student(String name, String id, String course, String phone, String gender) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getCourse() { return course; }
    public String getPhone() { return phone; }
    public String getGender() { return gender; }

    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setGender(String gender) { this.gender = gender; }
}
