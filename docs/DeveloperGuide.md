# Developer Guide 

* [Setting Up](#setting-up)
* [Appendix A: User Stories](#appendix-a--user-stories)
* [Appendix B: Use Cases](#appendix-b--use-cases)
* [Appendix C: Non Functional Requirements](#appendix-c--non-functional-requirements)
* [Appendix D: Glossary](#appendix-d--glossary)
* [Appendix E : Product Survey](#appendix-e-product-survey)


## Setting up

#### Prerequisites

1. **JDK `1.8.0_60`**  or later<br>

    > Having any Java 8 version is not enough. <br>
    This app will not work with earlier versions of Java 8.
    
2. **Eclipse** IDE
3. **e(fx)clipse** plugin for Eclipse (Do the steps 2 onwards given in
   [this page](http://www.eclipse.org/efxclipse/install.html#for-the-ambitious))
4. **Buildship Gradle Integration** plugin from the Eclipse Marketplace


#### Importing the project into Eclipse

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse (Note: Ensure you have installed the **e(fx)clipse** and **buildship** plugins as given 
   in the prerequisites above)
2. Click `File` > `Import`
3. Click `Gradle` > `Gradle Project` > `Next` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

  > * If you are asked whether to 'keep' or 'overwrite' config files, choose to 'keep'.
  > * Depending on your connection speed and server load, it can even take up to 30 minutes for the set up to finish
      (This is because Gradle downloads library files from servers during the project set up process)
  > * If Eclipse auto-changed any settings files during the import process, you can discard those changes.
  
#### Troubleshooting

**Problem: Eclipse reports compile errors after new commits are pulled from Git**
* Reason: Eclipse fails to recognize new files that appeared due to the Git pull. 
* Solution: Refresh the project in Eclipse:<br> 
  Right click on the project (in Eclipse package explorer), choose `Gradle` -> `Refresh Gradle Project`.
  
**Problem: Eclipse reports some required libraries missing**
* Reason: Required libraries may not have been downloaded during the project import. 
* Solution: [Run tests using Gardle](UsingGradle.md) once (to refresh the libraries).
 


## Appendix A : User Stories
Likeliness: Likely - `L`, Unlikely - `U`


Likeliness | As a... | I want to... | So that I can...
-------- | :-------- | :--------- | :-----------
`L` | New user | View the procedure of creating a task | Learn how to create a task first
`L` | New user | View info about a command | Learn how to use these commands
`L` | User | Add tasks with a description and a specific deadline | Set deadlines for tasks
`L` | User | Add tasks with description, start time and end time | Create events in the calendar
`L` | User | Add tasks with only a description | Set tasks that need to be completed at some point of time
`L` | User | Modify a task | Update deadlines and descriptions
`L` | User | Delete a task | Reflect my not having to do a task anymore in my to do list
`L` | User | Tick off a task | Record that this task is complete
`L` | User | Search for (a) task(s) | Find a task (and maybe edit it)
`L` | User | See upcoming tasks | Decide what to do next
`L` | User | List floating tasks | See whether I want to complete a floating task next
`L` | User | Assign priority to tasks | Gauge which task should be done next
`L` | User | Sort upcoming tasks by priority | Make the decision of which task to complete next faster
`L` | User | See tasks in a specific period of time | See what has been scheduled for a certain period
`L` | User | See upcoming tasks up until a specified time | See less / more upcoming tasks according to the time frame set by the user
`L` | User | Block multiple slots for a task | Choose later which slot I want to assign this task to and keep the selected slots free for that task
`L` | User | Decide slot for an item blocking multiple slots | Free up the other slots for other tasks
`L` | User | Use a keyboard shortcut to activate the manager | Speed up my workflow
`L` | User | Declare tasks that have to be done after a certain time | Track these tasks but do not remind after the certain date that is input by user
`L` | User | Interact with the manager using a CLI and keys | Get rid of the need for a mouse
`L` | User | Receive emails/notifications about pressing deadlines | Be reminded to complete these tasks
`L` | User | Undo operation(s) | Remove a mistake
`L` | User | Specify a folder as the storage area | User may be accessing the tasks from multiple computers using cloud storage, or open them from a local storage.
`L` | User | Declare recurring tasks | Remove the need to enter these tasks multiple times
`L` | User | Redo operation(s) | Redo a change that had been undone
`L` | User | Search for empty slots (within a given time frame) | Decide when to schedule a task
`L` | User | Integrate with third-party applications like GCalendar | Access my tasks on another platform too
`L` | Advanced User | Edit the storage file | Make changes without having to go through the manager
`L` | Advanced User | Declare my own names for commands | Personalise the experience and make it faster


## Appendix B : Use Cases


#### Use case: Delete task

**MSS**

1. User requests to list upcoming tasks
2. Task Manager shows a list of upcoming tasks
3. User requests to delete a specific task in the list
4. Task Manager deletes the task <br>
Use case ends.

**Extensions**

2a. The list is empty

> Use case ends

3a. The given index is invalid

> 3a1. Task Manager shows an error message <br>
  Use case resumes at step 2

#### Use case: Add task

**MSS**

1. User wants to add a task into the Task Manager
2. Task Manager recieves a set of information(event, time, person and others) and adds it into the list <br>
Use case ends.

**Extensions**
2a. Task Manager get empty information

> Use case ends

2b. Totally same set of information recieved by Task Manager

> 2b1. Delet it with a notice to the user <br>
  Use case ends
 
#### Use case: View instruction

**MSS**

1. User wants to view the instruction of creating a new task
2. Task Manager guides the user to finish a new task creating
3. Task Manager asks for reflection about whether the user understands

**Extensions**
2a. The progress breaks in the middle.

> Use case ends

3a. User reflected with doublts

> 3a1. Redo the step 2 again.
  Use case ends
  
#### Use case: View command meanings

**MSS**

1. User wants to view the commonds' explainations
2. Task Manager shows a list of practical commands
3. User wants the explainations for some specific commands
4. Task Manager shows the explainations for those commands

**Extensions**
3a. The given index is invalid

> 3a1. Task Manager shows an error message <br>
  Use case resumes at step 2

#### Use case: Modify task

**MSS**

1. User wants the list of tasks
2. Task Manager shows a list of tasks
3. Users wants to modify the information of a specific task
4. Task Manager modify the corresponding information

**Extensions**
2a. The list is empty

> Use case ends

3a. The given index or information is Invalid

> 3a1. Task Manager shows an error message <br>
  Use case resumes at step 2
  
#### Use case: Assign task priority

**MSS**

1. User wants the list of upcoming tasks
2. Task Manager shows the list of upcoming tasks
3. User wansts to set a specific task as top
4. Task Manager removes the task to the top of the list <br>

**Extensions**

2a. The list is empty

> Use canse ends

3a. The given index is invalid

> 3a1. Task Manager shows an error message <br>
  Use case resumes at step 2

4a. There is already a highest priority task

> 4a1. Task Manager set the new event as the top and noticed the user
  Use case ends
  
#### Use case: View tasks within a time

**MSS**
1. User wants to view the list of tasks
2. Task Manager shows the list of tasks
3. User wants to see the tasks within a specific time period
4. Task Manager shows the user the tasks within the specific time period <br>

**Extensions**
2a. The list is empty

> Use canse ends

3a. The time given is invalid

> Task Manager shows an error message <br>
  Use case resumes at step 2
  
4a. No tasks in such time period

> Task Manager shows that it is empty <br>
  Use case rusumes at step 2
  
#### Use case: View upcoming tasks

**MSS**
1. User wants to view the upcoming tasks.
2. Task Manager shows the user a list of upcoming tasks.

**Extension**
1. The list is empty

> Use case ends with a notice

## Appendix C : Non Functional Requirements

1. Should work on any [mainstream OS](#mainstream-os) as long as it has Java `1.8.0_60` or higher installed.
2. Should be able to hold up to 1000 tasks.
3. Should come with automated unit tests and open source code.
4. Should open within 1 second.
5. Should complete all operations within 0.5 seconds.
6. Should not require an internet connection to work.
7. Should not require installation to work.


## Appendix D : Glossary

##### Mainstream OS

> Windows, Linux, Unix, OS-X


## Appendix E : Product Survey



