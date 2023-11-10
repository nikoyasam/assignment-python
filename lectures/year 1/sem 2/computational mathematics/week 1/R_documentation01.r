---
title: "R_Documentation_01"
author: "Prashan Rathnayaka"
date: "2022-12-15"
output: pdf_document
---

```{r}
#adding some additional libraries

```
# BASIC COMMANDS
```{r}
# Run current line/selection 
#For mac: Cmd+Return
#For windows: Ctrl+Enter

#for more shortcuts: https://support.posit.co/hc/en-us/articles/200711853-Keyboard-Shortcuts-in-the-RStudio-IDE

2+2  # Basic math; press cmd/ctrl enter

1:100  # Prints numbers 1 to 100 across several lines

print("Hello World!")  # Prints "Hello World" in console
```
# ASSIGNING VALUES
```{r}
# <- 
#For mac: option+-
#For windows: Alt+-

# Individual values
a <- 1            # Use <- and not =
2 -> b            # Can go other way, but silly
c <- d <- e <- 3  # Multiple assignments

# Multiple values
x <- c(1, 2, 5, 9)  # c = Combine/concatenate
x                   # Print contents of x in Console

```
# SEQUENCES
```{r}

# Create sequential data
0:10     # 0 through 10
10:0     # 10 through 0
seq(10)  # 1 to 10
seq(30, 0, by = -3)  # Count down by 3
```
# MATH
```{r}
# Surround command with parentheses to also print
(y <- c(5, 1, 0, 10)) 
x + y       # Adds corresponding elements in x and y
x * 2       # Multiplies each element in x by 2
2^6         # Powers/exponents
sqrt(64)    # Squareroot
log(100)    # Natural log: base e (2.71828...)
log10(100)  # Base 10 log
```

```{r}
#R is case sensitive!
#X+y
```
# DATA TYPES
```{r}

# Numeric

n1 <- 15  # Double precision by default
n1
typeof(n1)
class(n1)

n2 <- 1.5
n2
typeof(n2)

# Character

c1 <- "c"
c1
typeof(c1)

c2 <- "a string of text"
c2
typeof(c2)

# Logical

l1 <- TRUE
l1
typeof(l1)

l2 <- F
l2
typeof(l2)
```
# DATA STRUCTURES
```{r}

## Vector ==================================================

v1 <- c(1, 2, 3, 4, 5)
v1
is.vector(v1)

v2 <- c("a", "b", "c")
v2
is.vector(v2)

v3 <- c(TRUE, TRUE, FALSE, FALSE, TRUE)
v3
is.vector(v3)

## Matrix ==================================================

m1 <- matrix(c(T, T, F, F, T, F), nrow = 2)
m1

m2 <- matrix(c("a", "b", 
               "c", "d"), 
               nrow = 2,
               byrow = T)
m2

## Array ===================================================

# Give data, then dimensions (rows, columns, tables)
a1 <- array(c( 1:24), c(4, 3, 2))
a1

## Data Frame ==============================================

# Can combine vectors of the same length

vNumeric   <- c(1, 2, 3)
vCharacter <- c("a", "b", "c")
vLogical   <- c(T, F, T)

df1 <- cbind(vNumeric, vCharacter, vLogical)
df1  # Coerces all values to most basic data type

df2 <- as.data.frame(cbind(vNumeric, vCharacter, vLogical))
df2  # Makes a data frame with three different data types

## List ====================================================

o1 <- c(1, 2, 3)
o2 <- c("a", "b", "c", "d")
o3 <- c(T, F, T, T, F)

list1 <- list(o1, o2, o3)
list1

list2 <- list(o1, o2, o3, list1)  # Lists within lists!
list2
```
