package doubled.sellus.review.adapter.in.internal;

import doubled.sellus.review.Review;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReviewReader {

    ResponseEntity<Review> getReview(Long id);

    ResponseEntity<List<Review>> getReviewByUserId(Long userId);

    ResponseEntity<List<Review>> getReviewByProductId(Long productId);

}
