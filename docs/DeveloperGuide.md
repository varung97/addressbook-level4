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
`L` | Advanced User | Use shorter forms of commands | Edit my to do list faster
`L` | Advanced User | Edit the storage file | Make changes without having to go through the manager
`U` | Advanced User | Declare my own names for commands | Personalise the experience and make it faster
`*` | user with many persons in the address book | sort persons by name | locate a person easily


## Appendix B : Use Cases

(For all use cases below, the **System** is the `AddressBook` and the **Actor** is the `user`, unless specified otherwise)

#### Use case: Delete person

**MSS**

1. User requests to list persons
2. AddressBook shows a list of persons
3. User requests to delete a specific person in the list
4. AddressBook deletes the person <br>
Use case ends.

**Extensions**

2a. The list is empty

> Use case ends

3a. The given index is invalid

> 3a1. AddressBook shows an error message <br>
  Use case resumes at step 2


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



