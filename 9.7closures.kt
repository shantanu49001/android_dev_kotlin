//lambdas and anonymous functions can acess their closures i.e variables outside their scope

fun printNext__():()->Unit{
    var count_=0
    return {count_++//labda function indide return acesses counter outside
}
}