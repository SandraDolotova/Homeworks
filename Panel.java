package todo_manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends DBConnection  {


        void showPanel() {

            JPanel panel = new JPanel();
            JButton next = new JButton("NEXT");
            JButton save = new JButton("SAVE");
            FlowLayout flowLayout = new FlowLayout();
            panel.setLayout(flowLayout);

            JLabel label1 = new JLabel("Create event: ");
            JTextField field1 = new JTextField(10);
            field1.addActionListener(next.getAction()); //  to DB


            //drop down list with elements from enum
            JComboBox<Event> dropDownList = new JComboBox();
            dropDownList.setModel(new DefaultComboBoxModel<>(Event.values()));
            dropDownList.setEditable(true);
            // get the value of the ComboBox on click
            dropDownList.getSelectedItem();  //  to DB

            // String selectedOption = (String) dropDownList.getSelectedItem(); // not working - Event ENUM cant be cast to String

            // buttons
            //before lambda was like that
            //ActionListener actionListener = new ActionListener(){
            ActionListener actionListener1 = e -> {
                JPanel nextWindowContent = new JPanel();
                JFrame nextFrame = new JFrame("TODO MANAGER");
                JLabel nextLabel = new JLabel("Set Date: ");
                JTextField field2 = new JTextField(10);
                field2.addActionListener(next.getAction()); //  to DB
                nextWindowContent.add(nextLabel);
                nextWindowContent.add(field2);
                nextWindowContent.add(save);
                nextFrame.setContentPane(nextWindowContent);
                nextFrame.setSize(500, 300);
                nextFrame.setVisible(true);
            };

            ActionListener actionListener2 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {


// method to send info to DB




                    System.out.print("ok");

                }
            };





            next.addActionListener(actionListener1);
            save.addActionListener(actionListener2);



            // how to add all components together onto panel
            panel.add(label1);
            panel.add(field1);
            panel.add(dropDownList);
            panel.add(next);

            // panel look
            JFrame frame = new JFrame("TODO MANAGER");
            // frame.pack(); ?   // what this is doing ? what is included in the pack ?
            frame.setContentPane(panel);
            frame.setSize(500, 300);
            frame.setVisible(true);

        }





    }
/*
    List<EventAdd> eventList () throws SQLException, ClassNotFoundException {


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from events");
        List<EventAdd> events = new ArrayList<EventAdd>();
        while (resultSet.next()){

            Integer eventId = resultSet.getInt("id");
            String date = resultSet.getString("date");
            String nameOfEvent = resultSet.getString("nameOfEvent");
            String description = resultSet.getString("description");
            EventAdd event = new EventAdd (eventId, date, nameOfEvent, description);
            events.add(event);
        }
        return events;
    }

    void insertEvent (EventAdd event) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO events (date, nameOfEvent, description)";
        PreparedStatement preparedStatement = DbConnectionEvent.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, event.getDate());
        preparedStatement.setString(3, event.getNameOfEvent());
        preparedStatement.setString(4, event.getDescription());

        preparedStatement.executeUpdate();
    }


*/
