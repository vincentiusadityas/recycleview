package id.ac.ui.cs.ristek.testgit.service;

import id.ac.ui.cs.ristek.testgit.model.ResponsePixabay;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vasun on 06/04/2017.
 */

public interface PixabayService {
    // hhtp://pixabay.com/api/?key=key&q=q
    @GET("api")
    Call<ResponsePixabay> getImages(@Query("key") String key, @Query("q") String q);

}
