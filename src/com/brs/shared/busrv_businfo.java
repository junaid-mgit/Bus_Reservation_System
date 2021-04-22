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
	
	public busrv_businfo() {
		super();
	}

	public busrv_businfo(int id, String bus_name, String slug, String type, Time arriving_time, Time depature_time,
			double fare, int no_of_seats, boolean is_active, LocalDateTime created_at, LocalDateTime updated_at,
			int arriving_from_id, int depature_at_id) {
		super();
		this.id = id;
		this.bus_name = bus_name;
		this.slug = slug;
		this.type = type;
		this.arriving_time = arriving_time;
		this.depature_time = depature_time;
		this.fare = fare;
		this.no_of_seats = no_of_seats;
		this.is_active = is_active;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.arriving_from_id = arriving_from_id;
		this.depature_at_id = depature_at_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Time getArriving_time() {
		return arriving_time;
	}

	public void setArriving_time(Time arriving_time) {
		this.arriving_time = arriving_time;
	}

	public Time getDepature_time() {
		return depature_time;
	}

	public void setDepature_time(Time depature_time) {
		this.depature_time = depature_time;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public int getArriving_from_id() {
		return arriving_from_id;
	}

	public void setArriving_from_id(int arriving_from_id) {
		this.arriving_from_id = arriving_from_id;
	}

	public int getDepature_at_id() {
		return depature_at_id;
	}

	public void setDepature_at_id(int depature_at_id) {
		this.depature_at_id = depature_at_id;
	}

	@Override
	public String toString() {
		return "busrv_businfo [id=" + id + ", bus_name=" + bus_name + ", slug=" + slug + ", type=" + type
				+ ", arriving_time=" + arriving_time + ", depature_time=" + depature_time + ", fare=" + fare
				+ ", no_of_seats=" + no_of_seats + ", is_active=" + is_active + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", arriving_from_id=" + arriving_from_id + ", depature_at_id="
				+ depature_at_id + "]";
	}
	
	
}
