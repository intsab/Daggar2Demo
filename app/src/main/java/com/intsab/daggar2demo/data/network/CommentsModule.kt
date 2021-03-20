package com.intsab.daggar2demo.data.network

import com.intsab.daggar2demo.data.models.CommentsModel
import dagger.Module
import dagger.Provides
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Module
class CommentsModule {
    @Provides
    fun provideServices():CommentsService{
        return object :CommentsService{
            override fun getComments(): Call<List<CommentsModel>> {
               return object :Call<List<CommentsModel>>{
                   override fun enqueue(callback: Callback<List<CommentsModel>>) {
                       TODO("Not yet implemented")
                   }

                   override fun isExecuted(): Boolean {
                       TODO("Not yet implemented")
                   }

                   override fun timeout(): Timeout {
                       TODO("Not yet implemented")
                   }

                   override fun clone(): Call<List<CommentsModel>> {
                       TODO("Not yet implemented")
                   }

                   override fun isCanceled(): Boolean {
                       TODO("Not yet implemented")
                   }

                   override fun cancel() {
                       TODO("Not yet implemented")
                   }

                   override fun execute(): Response<List<CommentsModel>> {
                       TODO("Not yet implemented")
                   }

                   override fun request(): Request {
                       TODO("Not yet implemented")
                   }

               }
            }
        }
    }
}