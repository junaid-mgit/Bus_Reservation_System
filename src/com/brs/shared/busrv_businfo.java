package com.brs.shared;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date; 

/*
 * Class for Bus information
 * contains methods to get and set Bus informations
 */

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
	
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
	public busrv_businfo() {
		super();
	}
public busrv_businfo(int id,String bus_name,boolean is_active)
{
    super();
    this.id=id;
    this.bus_name=bus_name;
    this.is_active=is_active;

}
=======
>>>>>>> Stashed changes
	/*
	 * Constructor for bus information class for initialization
	 * @param bus is
	 * @param bus name
	 * @param slug
	 * @param type of bus
	 * @param arriving time
	 * @param departure time
	 * @param fare
	 * @param number of seats
	 * @param active status
	 * @param time of creation
	 * @param time of updation
	 * @param arriving id
	 * @param departure id
	 */
<<<<<<< Updated upstream
=======
>>>>>>> 815171951a3a1398388b5c5451b79d75f6b76381
>>>>>>> Stashed changes
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
	
	/*
	 * gets bus id
	 * @return bus id
	 */
	public int getId() {
		return id;
	}
	/*
	 * sets bus id
	 * @param bus id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * gets bus name
	 * @return bus name
	 */
	public String getBus_name() {
		return bus_name;
	}
	/*
	 * sets bus name
	 * @param bus name to set
	 */
	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	/*
	 * gets slug
	 * @return slug
	 */
	public String getSlug() {
		return slug;
	}
	/*
	 * sets slug
	 * @param slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}
	/*
	 * gets type of bus
	 * @return type of bus
	 */
	public String getType() {
		return type;
	}
	/*
	 * sets type of bus
	 * @param type of the bus to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/*
	 * gets arriving time 
	 * @return arriving time
	 */
	public Time getArriving_time() {
		return arriving_time;
	}
	/*
	 * sets arriving time 
	 * @param arriving time to set
	 */
	public void setArriving_time(Time arriving_time) {
		this.arriving_time = arriving_time;
	}
	/*
	 * gets departure time
	 * @return departure time
	 */
	public Time getDepature_time() {
		return depature_time;
	}
	/*
	 * sets departure time
	 * @param departure time to set
	 */
	public void setDepature_time(Time depature_time) {
		this.depature_time = depature_time;
	}
	/*
	 * gets fare
	 * @return fare
	 */
	public double getFare() {
		return fare;
	}
	/*
	 * sets fare
	 * @param fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	/*
	 * gets number of seats 
	 * @return number of seats
	 */
	public int getNo_of_seats() {
		return no_of_seats;
	}
	/*
	 * sets number of seats
	 * @param number of seats to set
	 */
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	
	/*
	 * gets the active status
	 * @return the active status
	 */
	public boolean isIs_active() {
		return is_active;
	}
	/*
	 * sets the active status
	 * @param active status to set
	 */
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	/*
	 * gets time of creation
	 * @return created time
	 */
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	/*
	 * sets time of creation
	 * @param created time to set
	 */
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	/*
	 * gets time of updation
	 * @return updated time
	 */
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	/*
	 * set time of updation
	 * @param updation time to set
	 */

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	/*
	 * gets arriving id
	 * @return arriving id
	 */
	public int getArriving_from_id() {
		return arriving_from_id;
	}
	/*
	 * sets arriving id
	 * @param arriving id to set
	 */

	public void setArriving_from_id(int arriving_from_id) {
		this.arriving_from_id = arriving_from_id;
	}
	/*
	 * gets departure id
	 * @return departure id
	 */
	public int getDepature_at_id() {
		return depature_at_id;
	}
	/*
	 * sets departure id
	 * @param departure id to set
	 */
	public void setDepature_at_id(int depature_at_id) {
		this.depature_at_id = depature_at_id;
	}
	/*
	 * Overriding toString method
	 */
	@Override
	public String toString() {
		return "busrv_businfo [id=" + id + ", bus_name=" + bus_name + ", slug=" + slug + ", type=" + type
				+ ", arriving_time=" + arriving_time + ", depature_time=" + depature_time + ", fare=" + fare
				+ ", no_of_seats=" + no_of_seats + ", is_active=" + is_active + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", arriving_from_id=" + arriving_from_id + ", depature_at_id="
				+ depature_at_id + "]";
	}
	
	
}
