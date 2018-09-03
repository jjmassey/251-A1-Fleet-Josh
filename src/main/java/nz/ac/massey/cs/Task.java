package nz.ac.massey.cs;

import java.io.Serializable;
import java.util.Date;

// This class models a Task item

public class Task implements Serializable {

    private String description;
    private boolean completed;
    private String name;
    private Integer id;
    private Date date;

    private String priority;

    public Task(String name, String priority) {
        this.name = name;
        this.description = "";
        this.completed = false;
        this.priority = priority;
    }
    
    public boolean isComplete() {
        return completed;
    }
    
    public String getPriority() {
    	return priority;
    }
    
    public void setComplete(boolean complete) { completed = complete; }
}
