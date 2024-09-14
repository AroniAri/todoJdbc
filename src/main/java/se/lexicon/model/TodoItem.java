package se.lexicon.model;

import java.time.LocalDate;



     public class TodoItem {
        private int id;
        private String title;
        private String description;
        private LocalDate dueDate;
        private boolean done;
        private Person assignee;

         public TodoItem(int id, String title, String description, LocalDate dueDate, boolean done, Person assignee) {
             this.id = id;
             this.title = title;
             this.description = description;
             this.dueDate = dueDate;
             this.done = done;
             this.assignee = assignee;
         }

         public int getId() {
             return id;
         }

         public void setId(int id) {
             this.id = id;
         }

         public String getTitle() {
             return title;
         }

         public void setTitle(String title) {
             this.title = title;
         }

         public String getDescription() {
             return description;
         }

         public void setDescription(String description) {
             this.description = description;
         }

         public LocalDate getDueDate() {
             return dueDate;
         }

         public void setDueDate(LocalDate dueDate) {
             this.dueDate = dueDate;
         }

         public boolean isDone() {
             return done;
         }

         public void setDone(boolean done) {
             this.done = done;
         }

         public Person getAssignee() {
             return assignee;
         }

         public void setAssignee(Person assignee) {
             this.assignee = assignee;
         }


     }
