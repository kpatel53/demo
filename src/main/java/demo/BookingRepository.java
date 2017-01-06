package demo;

import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public class BookingRepository {

	@Component
	class BookingCommandLineRunner implements CommandLineRunner
	{

		private Object bookingRepository;

		@Override
		public void run(String... args) throws Exception {

			for(Booking b : ((JpaRepository<Booking,Long>) this.bookingRepository).findAll())
				System.out.println(b.toString());			
		}
		
	}
	interface BookingRepo extends JpaRepository<Booking, Long>{
		Collection<Booking> findByBookingName(String bookingName);
	}
	public Collection<Booking> findAll() {
		
		return null;
	}
	
}

