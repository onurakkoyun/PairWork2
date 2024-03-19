package org.example;

import java.util.List;

public class Guest extends User{
	
    private String name;

    private String address;

    //@JsonIgnore
    //@OneToMany(mappedBy = "guest")
    private List<Reservation> reservations;
    
    //@JsonIgnore
    //@OneToMany(mappedBy = "guest")
    private List<Review> reviews;

    public Guest() {
    }

    public Guest(String name, String address, List<Reservation> reservations, List<Review> reviews) {
		super();
		this.name = name;
		this.address = address;
		this.reservations = reservations;
		this.reviews = reviews;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
 
}
