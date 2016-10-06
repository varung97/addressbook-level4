# User Guide

* [Quick Start](#quick-start)
* [Features](#features)
  * [Primary Commands](#primary-commands)
  * [Extensions](#extensions)
* [Data Formats](#data-formats)
* [Cheat Sheet](#cheat-sheet)

<br>
## Quick Start

0. Ensure you have Java version `1.8.0_60` or later installed in your Computer.<br>
   > Having any Java 8 version is not enough. <br>
   This app will not work with earlier versions of Java 8.

1. Download the latest `taskmanager.jar` from the [releases](../../../releases) tab.
2. Copy the file to the folder you want to use as the home folder for your Task Manager.

3. Double-click the file to start the app. The GUI should appear in a few seconds.

4. To communicate with your task manager, type a command in the command box and press <kbd>Enter</kbd>
5. Some commands to get you started:
  * **`#help`** : Brings up the help page.
  * **`#add`**` Dinner with Mum` : Adds a task `Dinner with Mum` to your list.
  * **`#search`** : Lists all the tasks.
  * **`#delete`**` 3` : Deletes the 3rd contact as visible in the current list.

  Don't forget the `#` before the commands!

<br>
## Features

### Overview
This task manager uses some [primary commands](#primary-commands), like `add`, `edit`, `delete` and `search`. These commands can then be made more specific using [extensions](#extensions), such as `at`, `before`, `remind` and `duration`.<br><br>
This means that the primary commands are used in conjunction with extensions to give the manager more information about what you want to do.<br><br>
For example, you could search for all tasks to be done before 2pm 1st Oct 2016 by typing `#search #before 2pm 1 Oct 2016` (Note the use of `#` before keywords)
> The order of extensions is not fixed.

<br>
### Notation used:
`[date]`: Date is an optional argument<br>
`<hour>`: Replace with the actual hour

<br>
### Primary Commands

<a id="help"></a>
#### Viewing help: `#help`
_Overwhelmed by the amazingness of Task Ninja? Help's here to help you out._<br>
Format: `#help [#<command>]`

> This shows help for all commands<br>
If a command is specified, then it shows help for that command only<br>
Help is also shown if you enter an incorrect command, like `asdf`

Examples:
  * `#help`
  * `#help #add`
  * `#help #search`


<br>
<a id="add"></a>
#### Adding a task to the list: `#add`
_The most basic command... let's you start adding tasks to the manager._<br>
Format: `#add <task description> [<extensions>]`

> Task description outlines the task to be added<br>
Extensions allow specifying more details about the task, such as deadlines and venues<br>
Without any timing information, this will be added as a task without a time (a floating task)

Examples:
  * `#add Dinner with Arthur`
  * `#add Dinner with Arthur #at 8pm 25 Sep #venue Avalon`
  * `#add Finish 2103T Tutorial #before 11:59pm 29 Sep`
  * `#add Pay bills #after 11:59pm 20 Aug 2030`


<br>
<a id="search"></a>
#### Searching for tasks: `#search`
_Forgotten when you arranged that date? Use search!_<br>
Format: `#search [<extensions>]`

> Without any extensions, this will simple list all tasks<br>
Extensions allow filtering the list according to what you wish to see

Examples:
  * `#search`
  * `#search #before 2pm 30 Oct`
    * Finds all tasks that are before the given time
  * `#search #after 1am 1 Oct`
    * Finds all tasks that are after the given time
  * `#search #after 1am 1 Oct #before 2pm 30 Oct`
    * Finds all tasks that fall between the given times
  * `#search #venue Avalon`
  * `#search #after 1am 1 Oct #venue Avalon`


<br>
<a id="edit"></a>
#### Editing tasks: `#edit`
_Decided to postpone your homework? We let you do that too ;)_<br>
Format: `#edit <task number> [<new task description>] [<extensions>]`

> Task number specifies which out of the tasks on the screen you wish to modify<br>
If given, the new task description will replace the old one for this task<br>
Fields for the specified extensions will be changed

Examples:
  * `#edit 1 Dinner with Guinevere`
  * `#edit 2 #at 1am 3 Oct`
  * `#edit 1 Dinner with Guinevere #venue Under the stars`


<br>
<a id="delete"></a>
#### Deleting tasks: `#delete`
_Added a task you don't need? Fear not, for delete is here._<br>
Format: `#delete <task number>`

> Task number specifies which out of the tasks on the screen you wish to delete

Examples:
  * `#delete 1`
  * `#delete 3`


<br>
<a id="done"></a>
#### Ticking off tasks: `#done`
_Perhaps the most satisfying command! Let's you mark a task as done._<br>
Format: `#done <task number>`

> Task number specifies which out of the tasks on the screen you wish to tick off

Examples:
  * `#done 1`
  * `#done 3`


<br>
<a id="undo"></a>
#### Undoing previous changes: `#undo`
_Made a mistake? Go back in time using this command!_<br>
Format: `#undo [<number of changes>]`

> Number of changes is a number specifying how many changes you want to undo. If left out, default is 1 change<br>
Max number of changes that you can undo is 25

Examples:
  * `#undo`
  * `#undo 3`


<br>
<a id="redo"></a>
#### Redoing undone changes: `#redo`
_Made a mistake correcting a mistake? Use redo before you confuse yourself any further._<br>
Format: `#redo [<number of changes>]`

> Number of changes is a number specifying how many changes you want to redo. If left out, default is 1 change

Examples:
  * `#redo`
  * `#redo 3`


<br>
<a id="exit"></a>
#### Exiting the task manager: `#exit`
_This command closes the task manager. Hope to see you back soon!_<br>
Format: `#exit`

Examples:
  * `#exit`


<br>
<a id="storage"></a>
#### Specifying storage folder: `#storage`
_Allows you to specify where the storage file should be kept._<br>
Format: `#storage </absolute/path/to/folder>`

> Path must be an absolute path to the storage folder <br>
If this is set to a cloud storage folder, such as Dropbox, then this allows you to share your tasks across different devices

Examples:
  * `#storage /Documents/TaskManager/Storage`
  * `#storage /Dropbox/MyTodoList/Storage`


<br>
<a id="alias"></a>
#### Changing command names: `#alias`
_Prefer shorter or more personalised commands? Alias is here to help you change command names._<br>
Format: `#alias #<old command> #<new command>`

Examples:
  * `#alias #add #+`<br>
    `#+ Dinner with Beeblebrox`
    * Change `#add` to `#+`, then add new task using this command
  * `#alias #delete #-`<br>
    `#- 1`
    * Change `#delete` to `#-`, then delete 1st task on screen using this command
  * `#alias #undo #u`<br>
    `#u 4`
    * Change `#undo` to `#u`, then undo previous 4 actions using this command


<br>
<a id="commandchar"></a>
#### Changing command character: `#commandchar`
_Similar to aliasing, this lets you personalise the command character itself._<br>
Format: `#commandchar <new command character>`

> The character is # by default

Examples:
  * `#commandchar /`<br>
    `/add Dinner with Mum`
  * `#commandchar -`<br>
    `-add Dinner with Mum`


<br>
<a id="email"></a>
#### Specify your email: `#email`
_Supply the task manager with your email (for reminders)._<br>
Format: `#email <your email id>`

Examples:
  * `#email mileycyrus@weird.com`
  * `#email arthur@king.com`


<br>
#### Saving the data
Tasks are saved in the hard disk automatically after any command that changes the data.<br>
There is no need to save manually.


<br>
### Extensions

<a id="at"></a>
#### At a certain time: `#at`
_Marks an task/event that will be done at/will occur at a certain time._<br>
Format: `#at [<time and date>], [<further times and dates>]`

> Time and date indicate when the event begins. See format [here](#time-date)<br>
More times and dates can be specified using commas. This allows you to block multiple slots for a task. You can later decide which slot you want to do this task in by using the [edit](#edit) command

Examples:
  * `#add Submit assignment #at 11:59pm 3 Oct`
  * `#edit 1 #at 11:58pm 3 Oct`
  * `#search #at 2pm`
  * `#add Meeting with Boss #at 11am 3 Oct, 2pm 5 Oct`


<br>
<a id="before"></a>
#### Before a certain time: `#before`
_Specifies a deadline for a task._<br>
Format: `#before <time> [<date>]`

> Time and date indicate a deadline for the task. See format [here](#time-date)

Examples:
  * `#add Finish 2103T Tutorial #before 1pm`
  * `#edit 3 #before 12:30pm`
  * `#search #before 5pm 20 Oct`


<br>
<a id="after"></a>
#### After a certain time: `#after`
_Marks a task that should be done after a certain time._<br>
Format: `#after <time> [<date>]`

> Time and date indicate the time after which the task should be done. See format [here](#time-date)

Examples:
  * `#add Pay bills #after 11:50pm 30 Dec 2030`
  * `#edit 2 #after 11:59pm 30 Dec 2030`
  * `#search #after 11am`


<br>
<a id="duration"></a>
#### For a certain duration: `#duration`
_Allows you to specify how long the task will last._<br>
Format: `#duration <number> <time units>`

> Number is the number of time units for which the task will last<br>
Time units is one of mins/hours/days/weeks/years

Examples:
  * `#add Mid-term exam #at 7pm 3 Oct 2016 #duration 1 hr`
  * `#edit 2 #duration 2 weeks`
  * `#search #duration 3 hrs`


<br>
<a id="remind"></a>
#### Getting reminders: `#remind`
_Feeling forgetful? Get reminders using this command._<br>
Format: `#remind <time> [<date>], [<further times and dates>]`

> Will send you a reminder by email at the time and date specified. See format [here](#time-date)

Examples:
  * `#add Meeting with Boss #at 1pm #remind 11am`
  * `#add Meeting with Boss #at 1pm #remind 11am, 12:30pm`
  * `#add Complete Assignment #remind 7am 10 Oct, 7am 11 Oct`


<br>
<a id="venue"></a>
#### At a Venue: `#venue`
_Going to university and ended up at the mall? Remember your destination with this extension._<br>
Format: `#venue <description of venue>`

> The venue description is just stored as plain text

Examples:
  * `#add Lunch with Arthur #venue Avalon`
  * `#edit 1 #venue Round Table`
  * `#search #venue Avalon`


<br>
<a id="repeat"></a>
#### Recurring Task: `#repeatevery`
_Saves you from having to type in a task multiple times._<br>
Format: `#repeatevery <number> <time units>`

> Number specifies how often the task should repeat. For example, #repeatevery 3 weeks would repeat every 3 weeks<br> Time units is one of hours/weeks/months/years

Examples:
  * `#add Lunch with Arthur #at 8pm #repeatevery 2 weeks`
  * `#add 2103T Tutorial #at 4pm #repeatevery 1 weeks`
  * `#edit 1 #repeatevery 3 months`


<br>
<a id="priority"></a>
#### Priority level for tasks: `#priority`
_Assign a priority level to tasks._<br>
Format: `#priority <low/med/high>`

> Helps give levels of importance to tasks <br>
You can sort by priority so that it is easier to decide what task to do next<br>
Priority level can be low, medium or high

Examples:
  * `#add Lunch with Arthur #priority high`
  * `#edit 1 #priority med`
  * `#search #priority high`


<br>
<a id="sort"></a>
#### Sort by priority level: `#sort`
_Sort your search results by priority._<br>
Format: `#sort`

> ONLY works with search

Examples:
  * `#search #before 7pm #sort`
  * `#search #after 1pm 12 Oct #sort`
  * `#search #sort`
    * Displays all tasks sorted by priority
  * `#sort`
    * Okay, we lied. You can use `#sort` without primary commands to.
    * Sorts the currently displayed tasks by priority


<br>
<a id="float"></a>
#### Search for floating tasks: `#float`
_Let's you search for floating tasks (tasks with no specified time and date)._<br>
Format: `#float`

> ONLY works with search<br>
Will match any task without a set time and date

Examples:
  * `#search #float`
  * `#search #float #venue Avalon`
  * `#search #float #priority high`


<br>
## Data Formats

<a id="time-date"></a>
* `time and date`: `time or date or both`
  > Formats of [time](#time) and [date](#date) are below<br>
  Time defaults to 12:01 am if not specified<br>
  Date defaults to the current date if not specified

  Examples:
  * `7pm 5 Oct`
  * `3 Oct`
    * Stored as `12:01am 3 Oct`
  * `1pm`
    * Stored as `1pm <today's date>`

<br>
<a id="time"></a>
* `time`: `<hour>[:<minutes>]<am/pm>`<br>
  Examples:
  * `7pm`
  * `3:45am`
  * `1:00pm`
  * `2:02am`

<br>
<a id="hour"></a>
* `hour`: `<number 1-12>`<br>
  Examples:
  * `7`
  * `12`

<br>
<a id="minutes"></a>
* `minutes`: `<2-digit number 00-59>`<br>
  Examples:
  * `03`
  * `58`

<br>
<a id="date"></a>
* `date`: `<day> <month> [<year>]`<br>
  > Year defaults to current year if not specified

  Examples:
  * `5 Oct`
  * `5 Nov`
  * `1 Jan 2017`

<br>
<a id="day"></a>
* `day`: `<number 1-31>`<br>
  Examples:
  * `1`
  * `31`

<br>
<a id="month"></a>
* `month`: `<3-letter abbreviation>`<br>
  Examples:
  * `Jan`
  * `Mar`
  * `Sep`

<br>
<a id="year"></a>
* `year`: `4-digit integer`<br>
  Examples:
  * `2016`
  * `2020`


<br>
## Cheat Sheet

Type | Command | Format
:--------: | :--------: | ----- |
Primary | [Help](#help) | `#help [#<command>]`
Primary | [Add](#add) | `#add <task description> [<extensions>]`
Primary | [Search](#search) | `#search [<extensions>]`
Primary | [Edit](#edit) | `#edit <task number> [<extensions>]`
Primary | [Delete](#delete) | `#delete <task number>`
Primary | [Done](#done) | `#done <task number>`
Primary | [Undo](#undo) | `#undo [<number of changes>]`
Primary | [Redo](#redo) | `#redo [<number of changes>]`
Primary | [Exit](#exit) | `#exit`
Primary | [Storage](#storage) | `#storage </absolute/path/to/folder>`
Primary | [Alias](#alias) | `#alias #<old command> #<new command>`
Primary | [Command Char](#commandchar) | `#commandchar <new command character>`
Primary | [Email](#email) | `#email <your email id>`
Extension | [At](#at) | `#at <time> [<date>], [<further times and dates>]`
Extension | [Before](#before) | `#before <time> [<date>]`
Extension | [After](#after) | `#after <time> [<date>]`
Extension | [Duration](#duration) | `#duration <number> <time units>`
Extension | [Remind](#remind) | `#remind <time> [<date>], [<further times and dates>]`
Extension | [Venue](#venue) | `#venue <description of venue>`
Extension | [Repeat](#repeat) | `#repeatevery <number> <time units>`
Extension | [Priority](#priority) | `#priority <low/med/high>`
Extension | [Sort](#sort) | `#sort`
Extension | [Float](#float) | `#float`
Data | [Time and Date](#time-date) | `time or date or both`
Data | [Time](#time) | `<hour>[:<minutes>]<am/pm>`
Data | [Hour](#hour) | `<number 1-12>`
Data | [Minutes](#minutes) | `<2-digit number 00-59>`
Data | [Date](#date) | `<day> <month> [<year>]`
Data | [Day](#day) | `<number 1-31>`
Data | [Month](#month) | `<3-letter abbreviation>`
Data | [Year](#year) | `<4-digit number>`
