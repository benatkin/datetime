# date-service

This is the Clojure app that currently powers date.io. It's deployed
to Heroku.

My current plan for date.io is to create a date/time service where
people can do calculations on dates, get information on holidays, 
etc.

There may be a storage component to it, for appointments, but it's
my intent for it to be useful without any customization.

# Current Features

Tells the UTC time according to the server it's running on.

# Goals

## Treat dates and times as resources, with subresources and breadcrumbs

* `/2012` (year) show some year facts and a list of months, as well
  some extra elements that may be hidden such as weeks and a yearly
  calendar
* `/2012/02` (month) show some month facts and calendar of days
* `/2012/02/14` (day) show the hours in the day.
* `/2012/02/04/10` this is the range 10:00-10:59, 24-hour-time.
* `/2012/02/04/16/30` this is 4:30PM on 2012-02-04

Other divisions:

* `/2012/week/10` show the week of the year according to the most
  common convention
* `/2012/02/04/16/30?d=90m` this is from 4:30PM-6:00pm (d is for duration)

Breadcrumbs could be in a traditional date form. For example, this:

[2012](http://date.io/2012)-[02](http://date.io/2012/02)-[14](http://date.io/2012/02/14)
[09](http://date.io/2012/02/14/09):[00](http://date.io/2012/02/14/09/00)

instead of:

/[2012](http://date.io/2012) &raquo; [02](http://date.io/2012/02)
&raquo; [14](http://date.io/2012/02/14) &raquo;
[09](http://date.io/2012/02/14/09) &raquo; [00](http://date.io/2012/02/14/09/00)

It's going to be a challenge to figure out what should be GMT and what
should be local time.

There will be a lot of catching and redirecting going on. For instance
`/2012/02/14/3pm` could redirect to `/2012/02/14`. Also colons which
normally could redirect to.

If it's found useful, ranges could be proposed when going to
minutes that are multipliers of 30 or multipliers of 15. For instance
`/2012/02/14/03/15` could suggest `2012/02/14/03/15?d=15`. Or maybe
there would be links to 30-minute and 60-minute duration versions on
every minute page.

# 'nix-like tools

There should be a way to get simple, unix-y output. For instance
/2012/cal could show output similar to `cal -y`.

# JSON API

I'm interested in having a nice API for it.

# Storage?

While I want this to be useful without adding events or setting up
email for alerts, I'm interested in adding this.

# LICENSE

date-service is relased under the MIT License.
