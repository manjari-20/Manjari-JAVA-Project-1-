https://docs.google.com/document/d/1RF0tKKj7B2FekIptf_c0HpvXa1EOwqzkMYwMt5decQw/edit?pli=1&tab=t.0
This is the link of my project.
# Hospital Appointment Management System

## Overview

The Hospital Appointment Management System is a Java-based console application designed to manage doctor appointments efficiently. It allows patients to book and cancel appointments while ensuring that a doctor cannot have multiple appointments in the same time slot.

## Features

* Add doctors and patients
* Book appointments
* Check slot availability
* Prevent duplicate bookings
* Cancel appointments
* Display all appointment details

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Arrays

## Classes Used

### 1. Doctor Class

Stores doctor information:

* Doctor ID
* Name
* Specialization

### 2. Patient Class

Stores patient information:

* Patient ID
* Name
* Age

### 3. Appointment Class

Stores appointment details:

* Doctor
* Patient
* Time Slot
* Status (Booked/Cancelled)

### 4. AppointmentManager Class

Manages all appointment operations.

Methods:

* isSlotAvailable()
* bookAppointment()
* cancelAppointment()
* displayAppointments()

### 5. HospitalAppointmentApp Class

Contains the main method and demonstrates appointment booking and cancellation.

## Working Process

1. Create doctors and patients.
2. Book an appointment for a specific time slot.
3. Check whether the slot is available.
4. Prevent booking if the slot is already occupied.
5. Allow appointment cancellation.
6. Display appointment details and status.

## Sample Output

Booking appointment...
Appointment booked successfully!

Doctor: Dr. Sharma
Patient: Rahul
Time: 10:00 AM
Status: Booked

Trying same slot...
Error: Slot not available!

Cancelling...
Appointment cancelled successfully!

Doctor: Dr. Sharma
Patient: Rahul
Time: 10:00 AM
Status: Cancelled

## OOP Concepts Used

* Classes and Objects
* Encapsulation
* Association
* Constructors
* Array Handling

## Advantages

* Simple and user-friendly design
* Prevents duplicate appointment booking
* Easy appointment tracking
* Efficient appointment management

## Conclusion

This project demonstrates a basic Hospital Appointment Management System using Java. It helps manage doctor-patient appointments, prevents scheduling conflicts, and provides an effective way to track appointment status.

