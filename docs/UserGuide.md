# User Guide

* [Quick Start](#quick-start)
* [Features](#features)
  * [Primary Commands](#primary-commands)
  * [Extensions](#extensions)
* [Data Formats](#data-formats)
* [Command Summary](#command-summary)

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

## Features

### Notation used:
`[date]`: Means date is an optional argument<br>
`<hour>`: Replace by the actual hour

### Primary Commands

<a id="help"></a>
#### Viewing help: `#help`
Format: `#help [#<command>]`

> Shows complete help<br>
If a command is specified, then shows help for that command only<br>
Help is also shown if you enter an incorrect command, like `asdf`

Examples:
  * `#help`
  * `#help #add`
  * `#help #search`


<a id="add"></a>
#### Adding a task to the list: `#add`
Format: `#add <task description> [<extensions>]`

> Task description outlines the task to be added.<br> Extensions allow specifying more details about the task, such as deadlines and venues. <br>
Without any timing information, this will be added as a floating task. <br>
The details can be changed at any time using the `#edit` command.

Examples:
  * `#add Dinner with Arthur`
  * `#add Dinner with Arthur #at 8pm 25 Sep #venue Avalon`
  * `#add Finish 2103T Tutorial #before 11:59pm 29 Sep`
  * `#add Pay bills #after 11:59pm 20 Aug 2030`


<a id="search"></a>
#### Searching for tasks: `#search`
Format: `#search [<extensions>]`

> Without any extensions, this will simple list all tasks<br>
Extensions allow filtering the list according to what you wish to see

Examples:
  * `#search`
  * `#search #before 2pm 30 Oct`
  * `#search #after 1am 1 Oct`
  * `#search #after 1am 1 Oct #before 2pm 30 Oct`
  * `#search #venue Avalon`
  * `#search #after 1am 1 Oct #venue Avalon`


<a id="edit"></a>
#### Editing tasks: `#edit`
Format: `#edit <task number> [<new task description>] [<extensions>]`

> Task number specifies which out of the tasks on the screen you wish to modify<br>
If given, the new task description will replace the old one for this task<br>
Fields for the specified extensions will be changed

Examples:
  * `#edit 1 Dinner with Guinevere`
  * `#edit 2 #at 1am 3 Oct`
  * `#edit 1 Dinner with Guinevere #venue Under the stars`


<a id="delete"></a>
#### Deleting tasks: `#delete`
Format: `#delete <task number>`

> Task number specifies which out of the tasks on the screen you wish to delete

Examples:
  * `#delete 1`
  * `#delete 3`


<a id="done"></a>
#### Ticking off tasks: `#done`
Format: `#done <task number>`

> Task number specifies which out of the tasks on the screen you wish to tick off

Examples:
  * `#done 1`
  * `#done 3`


<a id="undo"></a>
#### Undoing previous changes: `#undo`
Format: `#undo [<number of changes>]`

> Number of changes is a number specifying how many changes you want to undo. If left out, default is 1 change. Max number of changes that you can undo is 25

Examples:
  * `#undo`
  * `#undo 3`


<a id="redo"></a>
#### Redoing undone changes: `#redo`
Format: `#redo [<number of changes>]`

> Number of changes is a number specifying how many changes you want to redo. If left out, default is 1 change

Examples:
  * `#redo`
  * `#redo 3`


<a id="storage"></a>
#### Specifying storage folder: `#storage`
Format: `#storage </absolute/path/to/folder>`

> Allows you to specify where the storage file should be kept. Path must be an absolute path to the storage folder <br>
If this is set to a cloud storage folder, such as Dropbox, then this allows you to share your tasks across different devices

Examples:
  * `#storage /Documents/TaskManager/Storage`
  * `#storage /Dropbox/MyTodoList/Storage`


<a id="alias"></a>
#### Changing command names: `#alias`
Format: `#alias #<old command> #<new command>`

> Allows you to change the name of a command according to preference

Examples:
  * `#alias #add #+`
  * `#alias #delete #-`
  * `#alias #undo #u`


<a id="commandchar"></a>
#### Changing command character: `#commandchar`
Format: `#commandchar <new command character>`

> Allows you to change the command character (# by default) to whatever you want

Examples:
  * `#commandchar /`
    `/add Dinner with Mum`
  * `#commandchar -`
    `-add Dinner with Mum`


<a id="exit"></a>
#### Exiting the task manager: `#exit`
Format: `#exit`

> Allows you to change the command character (# by default) to whatever you want

Examples:
  * `#exit`


#### Saving the data 
Tasks are saved in the hard disk automatically after any command that changes the data.<br>
There is no need to save manually.


### Extensions

<a id="at"></a>
#### At a certain time: `#at`
Format: `#at [<time and date>], [<further times and dates>]`

> Time and date together indicate when the event begins. See format [here](#time-date)<br>
Date indicates the date on which the event is. Defaults to the current day if not specified. See format [here](#date)<br>
More times and dates can be specified using commas. This allows you to block multiple slots for a task. You can later decide which slot you want to do this in by using the edit command

Examples:
  * `#add Submit assignment #at 11:59pm 3 Oct`
  * `#edit 1 #at 11:58pm 3 Oct`
  * `#search #at 2pm`
  * `#add Meeting with Boss #at 11am 3 Oct, 2pm 5 Oct`


<a id="before"></a>
#### Before a certain time: `#before`
Format: `#before <time> [<date>]`

> Time indicates what is the last time by which this task should be done. See format [here](#time)<br>
Date indicates the last date by which this task should be done. Defaults to the current day if not specified. See format [here](#date)

Examples:
  * `#add Finish 2103T Tutorial #before 1pm`
  * `#edit 3 #before 12:30pm`
  * `#search #before 5pm 20 Oct`


<a id="after"></a>
#### After a certain time: `#after`
Format: `#after <time> [<date>]`

> Time indicates the time after which the task should be done. See format [here](#time)<br>
Date indicates the date after which the task should be done. Defaults to the current day if not specified. See format [here](#date)

Examples:
  * `#add Pay bills #after 11:50pm 30 Dec 2030`
  * `#edit 2 #after 11:59pm 30 Dec 2030`
  * `#search #after 11am`


<a id="duration"></a>
#### For a certain duration: `#duration`
Format: `#duration <number> <time units>`

> Number is the number of time units for which the task will last<br>
Time units is one of mins/hours/days/weeks/years

Examples:
  * `#add Mid-term exam #at 7pm 3 Oct 2016 #duration 1 hr`
  * `#edit 2 #duration 2 weeks`
  * `#search #duration 3 hrs`


<a id="remind"></a>
#### Getting reminders: `#remind`
Format: `#remind <time> [<date>], [<further times and dates>]`

> Will send you a reminder by email at the time and date specified <br>
For format of time, see [here](#time)<br>
For format of date, see [here](#date). Date defaults to the current day if not specified

Examples:
  * `#add Meeting with Boss #at 1pm #remind 11am`
  * `#add Meeting with Boss #at 1pm #remind 11am, 12:30pm`
  * `#add Complete Assignment #remind 7am 10 Oct, 7am 11 Oct`


<a id="venue"></a>
#### At a Venue: `#venue`
Format: `#venue <description of venue>`

> The venue description is just stored as plain text

Examples:
  * `#add Lunch with Arthur #venue Avalon`
  * `#edit 1 #venue Round Table`
  * `#search #venue Avalon`


<a id="repeat"></a>
#### Recurring Task: `#repeatevery`
Format: `#repeatevery <number> <time units>`

> Number specifies how often the task should repeat. For example, #repeatevery 3 week would repeat every 3 weeks<br> Time units is one of hours/weeks/months/years

Examples:
  * `#add Lunch with Arthur #at 8pm #repeatevery 2 weeks`
  * `#add 2103T Tutorial #at 4pm #repeatevery 1 weeks`
  * `#edit 1 #repeatevery 1 months`


<a id="priority"></a>
#### Priority level for tasks: `#priority`
Format: `#priority <low/med/high>`

> Helps give levels of importance to tasks <br>
You can sort by priority so that it is easier to decide what task to do next<br>
Priority level can be low, medium or high

Examples:
  * `#add Lunch with Arthur #priority high`
  * `#edit 1 #priority med`
  * `#search #priority high`


<a id="sort"></a>
#### Sort by priority level: `#sort`
Format: `#sort`

> ONLY works with search

Examples:
  * `#search #before 7pm #sort`
  * `#search #after 1pm 12 Oct #sort`
  * `#search #sort`


<a id="float"></a>
#### Search for floating tasks: `#float`
Format: `#float`

> ONLY works with search<br>
Will match any task without a set time or date

Examples:
  * `#search #float`
  * `#search #float #venue Avalon`
  * `#search #float #priority high`


## Data Formats

<a id="time-date"></a>
* `time and date`: `time or date or both`
  > Formats of time and date are below<br>
  Time defaults to 12:01 am if not specified<br>
  Date defaults to the current date if not specified

  Examples:
  * `7pm 5 Oct`
  * `3 Oct` (Stored as `12:01am 3 Oct`)
  * `1pm` (Stored as `1pm <today's date>`)

<a id="time"></a>
* `time`: `<hour>[:<minutes>]<am/pm>`<br>
  Examples:
  * `7pm`
  * `3:45am`
  * `1:00pm`

<a id="hour"></a>
* `hour`: `<number 1-12>`<br>
  Examples:
  * `7`
  * `12`

<a id="minutes"></a>
* `minutes`: `<2-digit number 00-59>`<br>
  Examples:
  * `03`
  * `58`

<a id="date"></a>
* `date`: `<day> <month> [<year>]`<br>
  > Year defaults to current year if not specified
  
  Examples:
  * `5 Oct`
  * `5 Nov`
  * `1 Jan 2017`

<a id="day"></a>
* `day`: `<number 1-31>`<br>
  Examples:
  * `1`
  * `31`

<a id="month"></a>
* `month`: `<3-letter abbreviation>`<br>
  Examples:
  * `Jan`
  * `Mar`
  * `Sep`

<a id="year"></a>
* `year`: `4-digit integer`<br>
  Examples:
  * `2016`
  * `2020`


## Command Summary

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
Primary | [Storage](#storage) | `#storage </absolute/path/to/folder>`
Primary | [Alias](#alias) | `#alias #<old command> #<new command>`
Primary | [Command Char](#commandchar) | `#commandchar <new command character>`
Primary | [Exit](#exit) | `#exit`
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
