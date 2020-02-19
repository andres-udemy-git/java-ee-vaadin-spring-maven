package com.udemy.vaadin.views;

import com.udemy.vaadin.model.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.List;

@SpringUI(path = "/grid")
@Theme("valo")
public class GridView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        Grid grid1 = new Grid();
        grid1.addColumn("Name", String.class);
        grid1.addColumn("Age", Integer.class);

        grid1.addRow("John", 22);
        grid1.addRow("Mary", 25);
        grid1.addRow("Adam", 18);

        grid1.setHeightMode(HeightMode.ROW);
        grid1.setHeightByRows(3);
        grid1.setEditorEnabled(true);
        layout.addComponent(grid1);

        // Single Selection Model

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("John", 22));
        students2.add(new Student("Mary", 25));
        students2.add(new Student("Adam", 18));

        BeanItemContainer<Student> container2 = new BeanItemContainer<Student>(students2);

        Grid grid2 = new Grid(container2);
        grid2.setHeightMode(HeightMode.ROW);
        grid2.setHeightByRows(students2.size());
        grid2.setSelectionMode(Grid.SelectionMode.SINGLE);
        layout.addComponent(grid2);

        Button remove2 = new Button("Remove", event -> {
            grid2.getContainerDataSource().removeItem(grid2.getSelectedRow());
            grid2.getSelectionModel().reset();
            students2.forEach(s -> System.out.println(s));
        });
        layout.addComponent(remove2);

        // Multiple Selection Model

        List<Student> students3 = new ArrayList<>();
        students3.add(new Student("John", 22));
        students3.add(new Student("Mary", 25));
        students3.add(new Student("Adam", 18));

        BeanItemContainer<Student> container3 = new BeanItemContainer<Student>(students3);

        Grid grid3 = new Grid(container3);
        grid3.setHeightMode(HeightMode.ROW);
        grid3.setHeightByRows(students3.size());
        grid3.setSelectionMode(Grid.SelectionMode.MULTI);
        layout.addComponent(grid3);

        Button remove3 = new Button("Remove", event -> {
            grid3.getSelectionModel().getSelectedRows().stream().forEach(s ->
                    grid3.getContainerDataSource().removeItem(s)
            );
            grid3.getSelectionModel().reset();
        });
        layout.addComponent(remove3);

        setContent(layout);
    }

}
