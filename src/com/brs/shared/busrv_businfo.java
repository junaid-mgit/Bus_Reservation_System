package com.brs.shared;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class busrv_businfo {

	private int id;
	private String bus_name;
	private String slug;
	private String type;
	private Time arriving_time;
	private Time depature_time;
	private double fare;
	private int no_of_seats;
	private boolean is_active;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
	private int arriving_from_id;
	private int depature_at_id;
}
