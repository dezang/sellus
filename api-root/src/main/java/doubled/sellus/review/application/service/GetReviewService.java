package doubled.sellus.review.application.service;

import doubled.sellus.review.Review;
import doubled.sellus.review.application.port.in.GetReviewUseCase;
import doubled.sellus.review.application.port.out.LoadReviewPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetReviewService implements GetReviewUseCase {

    private final LoadReviewPort loadReview;

    @Override
    public Review getReview(Long reviewId) {
        return loadReview.getReview(reviewId);
    }

}
