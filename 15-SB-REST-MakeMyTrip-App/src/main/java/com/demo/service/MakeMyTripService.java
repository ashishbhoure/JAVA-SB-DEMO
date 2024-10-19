package com.demo.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.demo.request.Passanger;
import com.demo.responce.Ticket;

@Service
public class MakeMyTripService {
	
	@Value("${irctc.endpoint.book.ticket}")
	private String IRCTC_BOOK_TICKET_URL ;
	
	@Value("${irctc.endpoint.get.ticket}")
	private String IRCTC_GET_TICKET_URL ;
	
	public Ticket getTicketInfo(String ticketId) {
		WebClient webClient = WebClient.create();
		 Ticket ticket = webClient.get().uri(IRCTC_GET_TICKET_URL,ticketId).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(Ticket.class).block();
		 if(ticket!= null) {
			 return ticket;
		 }
		 return null;
		
	}

	public Ticket processTicketBooking(Passanger passanger) {
		
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
						.uri(IRCTC_BOOK_TICKET_URL)
						.body(BodyInserters.fromValue(passanger))
						.header("content-tye", "application/json")
						.accept(MediaType.APPLICATION_JSON)
						.retrieve()
						.bodyToMono(Ticket.class)
						.block();
		
		if(ticket!=null) {
			return ticket;
		}
		return null;
		
	}
}
