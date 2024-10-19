package com.demo.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.request.Passanger;
import com.demo.responce.Ticket;

@RestController
public class ErailRestController {
	
	private Map<Integer , Ticket> tickets = new HashMap<>();
	private int ticketId = 100;
	
	@PostMapping(
				value="/ticket",
				consumes= {"application/xml","application/json"},
				produces= {"application/xml","application/json"}
			)
	public Ticket bookTicket(@RequestBody Passanger passanger) {
		//logic toh book ticket
		
		
		Ticket t = new Ticket();
		t.setTicketId(ticketId);
		t.setFrom(passanger.getFrom());
		t.setTo(passanger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passanger.getTrainNum());
		t.setTicketCost("1500.00 INR");	
		
		tickets.put(ticketId, t);
		ticketId++;
		return t;
	}
	
	@GetMapping(
				value="/ticket/{ticketId}",
				produces= {"application/xml","application/json"}
			)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		// logic to get from db
		
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		
		return null;
		
	}
}
