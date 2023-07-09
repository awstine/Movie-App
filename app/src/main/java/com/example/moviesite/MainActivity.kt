package com.example.moviesite

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesite.ui.theme.MovieSiteTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieSiteTheme {
               Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.smallTopAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                                titleContentColor = MaterialTheme.colorScheme.onPrimary,
                            ),
                            title = {
                                Text(text = "Movie App")
                            }

                        )
                    }
                ) {

                    val headings = listOf("Trending Movies","Movies","Series","Previews")
                    val trendings = listOf("FastX","Extraction")
                    LazyColumn(

                        modifier = Modifier
                           // .background(color = Color.White)
                            .padding(8.dp)
                            .fillMaxSize(),
                       contentPadding = PaddingValues(5.dp)
                    ){
                        item {
                            Text(text = "Trending Movies")
                            LazyRow(
                                modifier = Modifier
                                    .padding(top = 25.dp)
                            ){

                                items(trendings){trending ->
                                    Image(painter = painterResource(R.drawable.bank),
                                        contentDescription =null ,
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(200.dp))

                                }
                                items(trendings){trending ->
                                    Image(painter = painterResource(R.drawable.terminal),
                                        contentDescription ="No" ,
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(200.dp))

                                }
                                items(trendings){trending ->
                                    Image(painter = painterResource(R.drawable.cent),
                                        contentDescription ="No" ,
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(200.dp))
                                }

                        }
                         Text(text = "Top Charts")
                            LazyRow{
                                items(trendings){trending ->
                                    Image(painter = painterResource(R.drawable.extraction),
                                        contentDescription =null ,
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(200.dp))

                                }
                                items(trendings){trending ->
                                    Image(painter = painterResource(R.drawable.iwais),
                                        contentDescription ="No" ,
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(200.dp))
                                }
                            }

                            Text(text = "Movies")
                            LazyRow{
                                    items(trendings){trending ->
                                        Image(painter = painterResource(R.drawable.triple),
                                            contentDescription =null ,
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .width(200.dp))

                                    }
                                    items(trendings){trending ->
                                        Image(painter = painterResource(R.drawable.baby),
                                            contentDescription ="No" ,
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .width(200.dp))
                                    }
                                }
                            }
                           

                            }

                        }

                    }

                }
                // A surface container using the 'background' color from the theme

                }

        }

