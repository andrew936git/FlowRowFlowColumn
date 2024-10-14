package com.example.flowrowflowcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flowrowflowcolumn.ui.theme.FlowRowFlowColumnTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val sortList = Person.persons.sortedWith(compareBy({ it.post }, {it.surname}, {it.name}))

            FlowColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .horizontalScroll(rememberScrollState())
                    .padding(top = 30.dp),
                maxItemsInEachColumn = 3
            ) {
                sortList.forEach{ item ->
                    Box(
                        modifier = Modifier
                            .size(height = 250.dp, width = 450.dp)
                            .padding(6.dp)
                            .background(Color.LightGray)
                    ) {
                        Column(verticalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_person),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp))
                            Text(
                                text = """Имя: ${item.name}
                                |Фамилия: ${item.surname}
                                |Должность: ${item.post}
                                |Зарплата: ${item.salary}
                            """.trimMargin(),
                                fontSize = 24.sp,
                                modifier = Modifier
                                    .padding(8.dp)
                            )
                        }

                    }

                }

            }
        }
    }
}


