create table ticket
(
   ticket_number integer not null,
   ticket_title varchar(255) not null,
   ticket_note varchar(255) not null,
   primary key(ticket_number)
);

CREATE TABLE ticket_table (
    ticket_id INTEGER NOT NULL AUTO_INCREMENT,
    ticket_title varchar(35) not null,
    ticket_note varchar(255),
    ticket_tag varchar(35) not null,
    ticket_alert boolean,
 	ticket_alert_date date(), --   YYYY-MM-DD HH:MI:SS
    ticket_status varchar(255),
    ticket_creation_date date(),
    PRIMARY KEY (ticket_id)

  );