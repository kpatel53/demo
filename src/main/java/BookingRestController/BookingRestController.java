package BookingRestController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.Booking;
import demo.BookingRepository;

@RestController
public class BookingRestController {
	@RequestMapping("/bookings")
	Collection<Booking> bookings(){
		return this.bookingRepository.findAll();
		
	}
@Autowired BookingRepository bookingRepository;
}
