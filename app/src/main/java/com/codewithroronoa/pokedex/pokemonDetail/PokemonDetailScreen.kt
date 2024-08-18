package com.codewithroronoa.pokedex.pokemonDetail

import android.util.Log
import android.widget.Toast
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.codewithroronoa.pokedex.R
import com.codewithroronoa.pokedex.data.remote.responses.Ability
import com.codewithroronoa.pokedex.data.remote.responses.AbilityInfo
import com.codewithroronoa.pokedex.data.remote.responses.DoubleDamageFrom
import com.codewithroronoa.pokedex.data.remote.responses.PokemonData
import com.codewithroronoa.pokedex.data.remote.responses.PokemonSpecies
import com.codewithroronoa.pokedex.data.remote.responses.Type
import com.codewithroronoa.pokedex.data.remote.responses.typeXX
import com.codewithroronoa.pokedex.ui.theme.Lobster_two
import com.codewithroronoa.pokedex.utils.Resource
import com.codewithroronoa.pokedex.utils.eggToColor
import com.codewithroronoa.pokedex.utils.parseStatToAbbr
import com.codewithroronoa.pokedex.utils.parseStatToColor
import com.codewithroronoa.pokedex.utils.parseTypeToColor
import com.codewithroronoa.pokedex.utils.parseTypeToSVG
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.Locale
import kotlin.math.round


@Composable
@OptIn(ExperimentalFoundationApi::class)
fun PokemonDetailScreen(
    dominantColor: Color,
    pokemonName: String,
    pokemonNumber : Int,
    navController: NavController,
    pokemonImageSize: Dp = 200.dp,
    topPadding: Dp = 20.dp,
    viewModel: PokemonDetailViewModel = hiltViewModel()
) {
    val tabList = listOf(
        "About",
        "Stats",
        "Moves",
        "Other"
    )
    val pagerState = rememberPagerState(pageCount = { tabList.size })
    Timber.tag("val").e(pokemonNumber.toString())
    val pokemonInfo = produceState<Resource<PokemonData>>(initialValue = Resource.Loading()) {
        value = viewModel.getPokemonInfo(pokemonName)
    }.value

    val pokemonSpecies = produceState<Resource<PokemonSpecies>>(initialValue = Resource.Loading()) {
        value = viewModel.getPokemonSpecies(pokemonNumber.toString())
    }.value


    Box(modifier = Modifier
        .fillMaxSize()
        .background(dominantColor)
    ) {
        PokemonDetailTopSection(
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f)
                .align(Alignment.TopCenter)
        )
        PokemonDetailStateWrapper(
            pokemonInfo = pokemonInfo,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .padding(
                    top = topPadding + pokemonImageSize / 2f,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
                .shadow(10.dp, RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(16.dp)
                .align(Alignment.BottomCenter),
            loadingModifier = Modifier
                .size(100.dp)
                .align(Alignment.Center)
                .padding(
                    top = topPadding + pokemonImageSize / 2f,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
            tabList = tabList,
            pagerState = pagerState,
            dominantColor = dominantColor, pokemonSpecies = pokemonSpecies
        )
        Box(contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxSize()) {
            if(pokemonInfo is Resource.Success) {
                pokemonInfo.data?.sprites?.let {
                    SubcomposeAsyncImage(
                        model = it.other.home.front_default,
                        contentDescription = pokemonInfo.data.name,
                        modifier = Modifier
                            .size(pokemonImageSize)
                            .offset(y = topPadding - 16.dp) // Positive y offset to move the image down
                    )
                }
            }
        }
    }
}

@Composable
fun PokemonDetailTopSection(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = modifier
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color.Black,
                        Color.Transparent
                    )
                )
            )
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(36.dp)
                .offset(16.dp, 16.dp)
                .clickable {
                    navController.popBackStack()
                }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PokemonDetailStateWrapper(
    pokemonInfo: Resource<PokemonData>,
    modifier: Modifier = Modifier,
    loadingModifier: Modifier = Modifier,
    dominantColor: Color,
    pagerState: PagerState,
    tabList: List<String>,
    pokemonSpecies: Resource<PokemonSpecies>

) {

    when(pokemonInfo){
        is Resource.Success -> {
            val gameGen = pokemonInfo.data!!.game_indices
            var mExpanded by remember { mutableStateOf(false) }
            val valSpinner = mutableListOf<String>()
            gameGen.forEachIndexed { _, gameIndice ->
                valSpinner.add(gameIndice.version.name)
            }
            var mSelectedText by remember {
                mutableStateOf(if(valSpinner.size==0)
                    ""
                else
                    valSpinner[0]
                )
            }
            val icon = if (mExpanded)
                Icons.Filled.KeyboardArrowUp
            else
                Icons.Filled.KeyboardArrowDown
            var mTextFieldSize by remember { mutableStateOf(Size.Zero)}
            Column(modifier=modifier.offset(y=100.dp)){
                Text(
                    text = "#${pokemonInfo.data.id} ${pokemonInfo.data.name.replaceFirstChar(Char::titlecase)
                    }",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Row(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentWidth()
                        .clickable {
                            mExpanded = !mExpanded
                        }) { // Anchor view
                    Text(text = mSelectedText,Modifier.padding(16.dp)) // City name label
                    Icon(imageVector = icon, contentDescription = null, tint = dominantColor, modifier = Modifier.padding(16.dp))
                    DropdownMenu(
                        expanded = mExpanded,
                        onDismissRequest = { mExpanded = false },
                    ) {
                        valSpinner.forEach { label ->
                            DropdownMenuItem(text = { Text(text = label)}, onClick = {
                                mSelectedText = label
                                mExpanded = false
                            })
                        }
                    }
                }
                TabLayoutSection(tabList = tabList, pagerState = pagerState, dominantColor = dominantColor, pokemonInfo = pokemonInfo.data, pokemonSpecies = pokemonSpecies)
            }
        }
        is Resource.Error->{
            Text(
                text = pokemonInfo.message!!,
                color = Color.Red,
                modifier = modifier
            )
        }
        is Resource.Loading ->{
            CircularProgressIndicator(
                color = MaterialTheme.colorScheme.primary,
                modifier = loadingModifier
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabLayoutSection(
    tabList: List<String>,
    pagerState: PagerState,
    dominantColor: Color,
    pokemonInfo: PokemonData,
    pokemonSpecies : Resource<PokemonSpecies>
) {
    Column {
        TabLayout(tabList = tabList, pagerState = pagerState, dominantColor = dominantColor)
        TabContent(tabList = tabList, pagerState = pagerState, pokemonInfo = pokemonInfo, dominantColor = dominantColor, pokemonSpecies = pokemonSpecies)
    }
}

@Composable
fun PokemonInfoSectionWrapper(
    pokemonSpecies: Resource<PokemonSpecies>,
    dominantColor: Color,
    pokemonInfo: PokemonData,
    modifier: Modifier = Modifier) {
    Timber.tag("response").e(pokemonSpecies.toString())
    when(pokemonSpecies){
        is Resource.Success->{
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 200.dp)
            ){
                PokemonAbout(
                    dominantColor = dominantColor,
                    pokemonSpecies = pokemonSpecies.data!!,
                    pokemonInfo = pokemonInfo
                )
                PokemonAbilities(
                    dominantColor = dominantColor,
                    pokemonAbility = pokemonInfo.abilities
                )
                PokemonTraining(dominantColor = dominantColor,pokemonSpecies = pokemonSpecies.data,pokemonInfo=pokemonInfo)
                PokemonBreeding(dominantColor = dominantColor,pokemonSpecies = pokemonSpecies.data,pokemonInfo=pokemonInfo)
            }
        }
        is Resource.Error -> {
            Text(
                text = pokemonSpecies.message!!,
                color = Color.Red,
                modifier = modifier
            )
        }
        is Resource.Loading -> {
            CircularProgressIndicator(
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .size(100.dp)
                    .padding(
                        16.dp
                    ),
            )
        }
    }
}
@Composable
fun PokemonBreeding(
    dominantColor: Color,
    pokemonSpecies: PokemonSpecies,
    pokemonInfo: PokemonData
) {
    val shape = RoundedCornerShape(16.dp)
    Text(
        text = " Breeding ",
        color = dominantColor,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .zIndex(2f)
            .offset(y = (12).dp)
            .clip(RoundedCornerShape(16.dp))  // Clips the text to rounded corners
            .border(
                1.dp,
                dominantColor,
                RoundedCornerShape(16.dp)
            )
            .background(Color.White)
            .padding(horizontal = 8.dp, vertical = 4.dp)
    )
    Box(
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                shape = shape
            )
            .background(color = Color.White, shape = shape)
            .fillMaxWidth()
            .wrapContentHeight()
            .zIndex(1f),
    ) {
        Column{
            Text(text = "Egg Types : ", modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val eggTypes = pokemonSpecies.egg_groups
                eggTypes.forEachIndexed { index, eggGroup ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .weight(1f)
                            .clip(CircleShape)
                            .background(eggToColor(eggGroup.name).copy(alpha = 0.2f))
                            .height(35.dp)
                    ) {
                        Text(
                            text = eggGroup.name.replaceFirstChar(Char::titlecase),
                            textAlign = TextAlign.Center,
                            color = eggToColor(eggGroup.name),
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
            }
            Text(text = "Egg Cycle : ", modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 8.dp), fontSize = 18.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = pokemonSpecies.hatch_counter.toString() + "  (" +pokemonSpecies.hatch_counter*255 +" steps )", modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp))

        }
        // Example of how to add the species flavor text
    }
}

@Composable
fun PokemonTraining(
    dominantColor: Color,
    pokemonSpecies: PokemonSpecies,
    pokemonInfo: PokemonData
) {
    val shape = RoundedCornerShape(16.dp)
    Text(
        text = " Training ",
        color = dominantColor,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .zIndex(2f)
            .offset(y = (12).dp)
            .clip(RoundedCornerShape(16.dp))  // Clips the text to rounded corners
            .border(
                1.dp,
                dominantColor,
                RoundedCornerShape(16.dp)
            )  // Adds a border with the dominant color
            .background(Color.White)  // Background color inside the border
            .padding(horizontal = 8.dp, vertical = 4.dp)
    )
    Box(
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                shape = shape
            )
            .background(color = Color.White, shape = shape)
            .fillMaxWidth()
            .wrapContentHeight()
            .zIndex(1f),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(top = 8.dp)
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Growth Rate : ${pokemonSpecies.growth_rate.name}",
                fontSize = 14.sp,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(text = "Catch Rate : ${pokemonSpecies.capture_rate}",
                fontSize = 14.sp,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(text = "Base Happiness : ${pokemonSpecies.base_happiness}",
                fontSize = 14.sp,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(text = "Base Experience : ${pokemonInfo.base_experience}",
                fontSize = 14.sp,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )

        }
        // Example of how to add the species flavor text
    }
}


@Composable
fun PokemonAbout(
    modifier: Modifier = Modifier,
    dominantColor: Color,
    pokemonSpecies: PokemonSpecies,
    pokemonInfo: PokemonData
) {
    val shape = RoundedCornerShape(8.dp)
    val t:String = pokemonSpecies.genera[7].genus
    val about :String = pokemonSpecies.flavor_text_entries[0].flavor_text.replace("\n"," ")
        .replace("\u000c"," ")
    Text(
        text = " Species ",
        color = dominantColor,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .zIndex(2f)
            .offset(y = (12).dp)
            .clip(RoundedCornerShape(16.dp))  // Clips the text to rounded corners
            .border(
                1.dp,
                dominantColor,
                RoundedCornerShape(16.dp)
            )  // Adds a border with the dominant color
            .background(Color.White)  // Background color inside the border
            .padding(horizontal = 8.dp, vertical = 4.dp)
    )
    Box(
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                shape = shape
            )
            .background(color = Color.White, shape = shape)
            .wrapContentHeight()
            .zIndex(1f),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ){
            Text(
                text = t,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
                )
            Text(text = about,
                modifier = Modifier
                    .padding(top = 8.dp),
                fontSize = 14.sp,
                textAlign = TextAlign.Justify
                )
            PokemonTypeSection(types =pokemonInfo.types )
            PokemonDetailDataSection(pokemonWeight = pokemonInfo.weight, pokemonHeight = pokemonInfo.height, femalePercentage = pokemonSpecies.gender_rate)
        }
        // Example of how to add the species flavor text
    }



}

@Composable
fun PokemonTypeSection(
    types : List<Type>,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(8.dp)
    ){
        for (type in types){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
                    .clip(CircleShape)
                    .background(parseTypeToColor(type))
                    .height(35.dp)
            ) {
                Icon(painter = painterResource(id = parseTypeToSVG(type)), contentDescription = type.toString(),
                    modifier = Modifier
                        .size(20.dp),
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = type.type.name.replaceFirstChar(Char::titlecase),
                    color = Color.White,
                    fontSize = 18.sp,
                )

            }
        }
    }
}

@Composable
fun PokemonDetailDataSection(
    pokemonWeight : Int,
    pokemonHeight : Int,
    sectionHeight : Dp = 80.dp,
    femalePercentage : Int
) {
    val pokemonWeightInKg = remember{
        round(pokemonWeight * 100f ) /1000f
    }
    val pokemonHeightInM = remember{
        round(pokemonHeight * 100f ) /1000f
    }

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ){
        PokemonDetailDataItem(dataValue = pokemonWeightInKg,
            dataUnit = "kg",
            dataIcon = painterResource(id = R.drawable.weight_1),
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier
            .size(1.dp, sectionHeight)
            .background(Color.LightGray))
        Column( modifier = Modifier
            .weight(1f)
            .height(sectionHeight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row {
                Icon(painter = painterResource(R.drawable.grass), contentDescription = null, modifier = Modifier.size(12.dp))
                Text(text = "Male : ${(8-(femalePercentage))*12.5f} %", fontSize = 12.sp)
            }
            Row {
                Icon(painter = painterResource(R.drawable.grass), contentDescription = null, modifier = Modifier.size(12.dp))
                Text(text = "Female : ${(femalePercentage)*12.5f} %", fontSize = 12.sp)
            }
        }
        Spacer(modifier = Modifier
            .size(1.dp, sectionHeight)
            .background(Color.LightGray))
        PokemonDetailDataItem(dataValue = pokemonHeightInM,
            dataUnit = "m",
            dataIcon = painterResource(id = R.drawable.height),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun PokemonDetailDataItem(
    dataValue : Float,
    dataUnit : String,
    dataIcon : Painter,
    modifier: Modifier = Modifier
) {
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center,
       modifier = modifier
   ) {
       Icon(
           painter = dataIcon,
           modifier= Modifier
               .width(48.dp)
               .height(48.dp),
           contentDescription = null,
       )
       Spacer(modifier = Modifier.height(8.dp))
       Text(
           text = "$dataValue$dataUnit",
           color = MaterialTheme.colorScheme.onSurface
       )
   }
}

@Composable
fun PokemonStat(
    statName : String,
    statValue : Int,
    statMaxValue : Int,
    statColor : Color,
    height: Dp = 28.dp,
    animDuration : Int = 1000,
    animDelay : Int = 0
) {
    var animationPlayed by remember {
        mutableStateOf(false)
    }
    val currPercent = animateFloatAsState(
        targetValue =  if(animationPlayed){
                     statValue / statMaxValue.toFloat()
        } else 0f   ,
        animationSpec = tween(
            animDuration,
            animDelay
        )
    )
    LaunchedEffect(key1 = true) {
           animationPlayed = true
    }
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(CircleShape)
            .background(
                if (isSystemInDarkTheme()) {
                    Color.DarkGray
                } else {
                    Color.LightGray
                }
            )
    ){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(currPercent.value)
                .clip(CircleShape)
                .background(statColor)
                .padding(horizontal = 8.dp)
        ){
            Text(
                text = statName,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = (currPercent.value * statMaxValue).toInt().toString(),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun PokemonBaseStats(
    pokemonInfo: PokemonData,
    animDelayPerItem: Int = 100
) {
    val maxBase = remember {
        pokemonInfo.stats.maxOf { it.base_stat }
    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Base stats :",
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.height(4.dp))
        for (i in pokemonInfo.stats.indices){
            val stat = pokemonInfo.stats[i]
            PokemonStat(
                statName = parseStatToAbbr(stat),
                statValue = stat.base_stat,
                statMaxValue = maxBase,
                statColor = parseStatToColor(stat),
                animDelay = i*animDelayPerItem
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabLayout(
    tabList : List<String>,
    pagerState: PagerState,
    dominantColor: Color,
    ) {
    val scope = rememberCoroutineScope()
    TabRow(
        selectedTabIndex = pagerState.currentPage,
        indicator = { tabPositions ->
            SecondaryIndicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                height = 3.dp,
                color = dominantColor
            )
        }
        ,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        tabList.forEachIndexed { index, data ->
            Tab(selected = pagerState.currentPage==index, onClick = {
                scope.launch { pagerState.animateScrollToPage(index) }
            },
                text = {
                    Text(text = data)
                }
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabContent(
    tabList: List<String>,
    pagerState: PagerState,
    pokemonInfo: PokemonData,
    dominantColor: Color,
    pokemonSpecies: Resource<PokemonSpecies>
) {
    val nestedScrollConnection = remember {
        object : NestedScrollConnection {}
    }
    HorizontalPager(
        state = pagerState,
    ) { index ->
        when(index){
            0->{
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState(), enabled = true)
                        .fillMaxWidth()
                ){
                    PokemonInfoSectionWrapper(
                        pokemonSpecies = pokemonSpecies,
                        dominantColor = dominantColor,
                        pokemonInfo = pokemonInfo
                    )
                }
            }
            1->{
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState(), enabled = true)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Top
                ){
                    PokemonBaseStats(pokemonInfo = pokemonInfo)
                    PokemonAttack(pokemonInfo = pokemonInfo)
                }
            }
            2->{
            }
            3->{

            }
        }
    }
}


@Composable
fun PokemonAbilities(
    modifier: Modifier = Modifier,
    dominantColor: Color,
    pokemonAbility: List<Ability>,
    viewModel: PokemonDetailViewModel = hiltViewModel()
) {
    val shape = RoundedCornerShape(16.dp)
    Text(
        text = " Abilities ",
        color = dominantColor,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .zIndex(2f)
            .offset(y = (12).dp)
            .clip(RoundedCornerShape(16.dp))  // Clips the text to rounded corners
            .border(
                1.dp,
                dominantColor,
                RoundedCornerShape(16.dp)
            )  // Adds a border with the dominant color
            .background(Color.White)  // Background color inside the border
            .padding(horizontal = 8.dp, vertical = 4.dp)
    )
    Box(
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                shape = shape
            )
            .background(color = Color.White, shape = shape)
            .fillMaxWidth()
            .wrapContentHeight()
            .zIndex(1f),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(top = 8.dp)
        ){
            Text(text = "Abilities are special attributes given to each Pokémon that can aid them in battle. Many abilities act as a power-up by increasing a move or stat; others introduce a third-party effect like a weather condition.",
                fontSize = 14.sp,
                textAlign = TextAlign.Justify
            )
            pokemonAbility.forEachIndexed { index, ability ->
                val url = ability.ability.url
                val pokemonAbilityVal = produceState<Resource<AbilityInfo>>(initialValue = Resource.Loading()) {
                    value = viewModel.getPokemonAbilities(url.substringAfter("https://pokeapi.co/api/v2/ability/").substringBefore("/"))
                }.value
                when(pokemonAbilityVal){
                    is Resource.Error->{
                        Text(
                            text = pokemonAbilityVal.message!!,
                            color = Color.Red,
                            modifier = modifier
                        )
                    }
                    is Resource.Loading ->{
                        CircularProgressIndicator(
                            color = MaterialTheme.colorScheme.primary,
                        )
                    }
                    is Resource.Success -> {
                        Abilities(dominantColor = dominantColor, ability = ability, abilityInfo = pokemonAbilityVal.data!!)
                    }
                }

            }
        }
        // Example of how to add the species flavor text
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Abilities(
    modifier: Modifier = Modifier,
    dominantColor: Color,
    ability: Ability,
    abilityInfo: AbilityInfo

) {
    val lighterColor = dominantColor.copy(alpha = 0.4f)  // Adjust alpha to make it lighter
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    val scope = rememberCoroutineScope()
    var showBottomSheet by remember { mutableStateOf(false) }
    Column (
        modifier = Modifier
            .padding(top = 8.dp)
            .padding(top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.Center,
        ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(lighterColor)
            .padding(start = 8.dp, end = 8.dp)
            .clickable(onClick = {
                showBottomSheet = true
            }),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = ability.ability.name.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.ROOT
                    ) else it.toString()
                },
                color = dominantColor,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,

                )
            Icon(
                painter = painterResource(id = R.drawable.baseline_info_outline_24),
                contentDescription = null,
                tint = dominantColor
            )
        }
        var pokemonText = remember {
            ""
        }
        abilityInfo.flavor_text_entries.forEachIndexed { index, flavorTextEntryX ->
            if(flavorTextEntryX.language.name=="en") {
                pokemonText = flavorTextEntryX.flavor_text
                return@forEachIndexed
            }

        }
        Text(text = pokemonText, fontSize = 14.sp)
    }
    if (showBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = {
                showBottomSheet = false
            },
            sheetState = sheetState,

        ) {
            // Set the height of the BottomAbilities content to 70% of the screen height
            BottomAbilities(
                abilityInfo = abilityInfo,
                dominantColor = dominantColor,
                modifier = Modifier
                    .fillMaxHeight() // Set height to 70% of the screen
            )
        }
    }
}

@Composable
fun BottomAbilities(modifier: Modifier = Modifier,abilityInfo: AbilityInfo,dominantColor: Color) {
    val contex = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.7f)
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "ABILITY",
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.LightGray,
            fontFamily = Lobster_two,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 14.sp
        )
        Text(
            text = abilityInfo.name.capitalize(Locale.ROOT),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = Lobster_two,
            fontSize = 22.sp
        )
        val shape = RoundedCornerShape(16.dp)
        Text(
            text = " Details ",
            color = dominantColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .zIndex(2f)
                .offset(y = (12).dp)
                .clip(RoundedCornerShape(16.dp))  // Clips the text to rounded corners
                .border(
                    1.dp,
                    dominantColor,
                    RoundedCornerShape(16.dp)
                )  // Adds a border with the dominant color
                .background(Color.White)  // Background color inside the border
                .padding(horizontal = 8.dp, vertical = 4.dp)
        )
        Box(
            modifier = Modifier
                .shadow(
                    elevation = 5.dp,
                    shape = shape
                )
                .background(color = Color.White, shape = shape)
                .fillMaxWidth()
                .zIndex(1f),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .padding(top = 8.dp)
            ) {
                Text(
                    text = "Description",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 16.dp)
                )
                var pokemonText = remember {
                    ""
                }
                abilityInfo.flavor_text_entries.forEachIndexed { index, flavorTextEntryX ->
                    if(flavorTextEntryX.language.name=="en") {
                        pokemonText = flavorTextEntryX.flavor_text
                        return@forEachIndexed
                    }
                }
                Text(text = pokemonText,modifier = Modifier.padding(top = 8.dp))
                var effect = remember {
                    ""
                }
                var details = remember {
                    ""
                }
                abilityInfo.effect_entries.forEachIndexed { index, effectEntry ->
                    if(effectEntry.language.name=="en"){
                        effect = effectEntry.effect
                        details = effectEntry.short_effect
                        return@forEachIndexed
                    }
                }
                Text(
                    text = "Effects",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                    ,modifier = Modifier.padding(top = 16.dp)
                )
                Text(text = effect, modifier = Modifier.padding(top = 8.dp))
                Text(
                    text = "Details",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(text = details,modifier = Modifier.padding(top = 8.dp,bottom = 16.dp))
                }
            }
        }
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .height(70.dp),
        onClick = {
            Toast.makeText(contex,"clicked",Toast.LENGTH_SHORT).show();
        },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = dominantColor
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Icon(painter = painterResource(id = R.drawable.pokeball),
                tint = Color.White,
                contentDescription = null,
                modifier = Modifier.fillMaxHeight()
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "POKEMON LIST",
                fontSize = 16.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

@Composable
fun PokemonAttack(
    modifier: Modifier = Modifier,
    pokemonInfo: PokemonData,
    viewModel: PokemonDetailViewModel = hiltViewModel()
) {
    val types = pokemonInfo.types
    val map = mutableMapOf<String, Double>()
    types.forEachIndexed { _, type ->
        val typeDetails = produceState<Resource<typeXX>>(initialValue = Resource.Loading()) {
            value = viewModel.getDamage(type.type.name)
        }.value
        Timber.tag("value").e(type.type.name)
        when(typeDetails){
            is Resource.Success ->{
                val damageRelations = typeDetails.data!!.damage_relations
                val doubleDamageFrom = damageRelations.double_damage_from
                val halfDamageFrom = damageRelations.half_damage_from
                val noDamageFrom = damageRelations.no_damage_from
                Timber.tag("map").e(damageRelations.toString())
                doubleDamageFrom.fastForEachIndexed { _, doubleDamage ->
                    map[doubleDamage.name] = map.getOrDefault(doubleDamage.name,1.0)*2.0
                }
                halfDamageFrom.forEachIndexed { _, halfDamage ->
                    map[halfDamage.name]= map.getOrDefault(halfDamage.name, defaultValue = 1.0) * 0.5f
                }
                noDamageFrom.forEachIndexed { i, noDamage ->
                    map[noDamage.name] = map.getOrDefault(noDamage.name,1.0)*0.0
                }
                val very_weak = mutableListOf("")
                val weak = mutableListOf("")
                val normal = mutableListOf("")
                val resistance = mutableListOf("")
                val very_resistance = mutableListOf("")
                val immune = mutableListOf("")
                map.forEach{ (typeVal, stats) ->
                    if(stats==4.0) very_weak.add(typeVal)
                    else if (stats == 2.0) weak.add(typeVal)
                    else if (stats == 1.0) normal.add(typeVal)
                    else if (stats == 0.5) resistance.add(typeVal)
                    else if (stats == 0.25) very_resistance.add(typeVal)
                    else immune.add(typeVal)
                }
                DamageStats(list = very_weak)

            }

            is Resource.Error -> {
                Text(
                    text = typeDetails.message!!
                )
            }
            is Resource.Loading -> {

            }
        }
    }
    Text(text = map.toString())
}

@Composable
fun DamageStats(
    list : List<String>
) {
    LazyColumn {
        items(list){

        }
    }
}
