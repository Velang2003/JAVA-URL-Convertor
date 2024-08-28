# Java Link Shortener

A simple Java-based URL shortener that allows users to shorten long URLs and expand shortened URLs back to their original form. This project includes basic error handling and persistence to maintain link mappings between sessions.

# Features

**URL Shortening:** Convert long URLs into shorter, more manageable URLs.
**URL Expansion:** Expand shortened URLs back to their original form.
**Collision Handling:** Ensures uniqueness of short URLs by handling potential collisions.
**CLI Interface:** Provides a simple command-line interface for user interaction.

# Requirements
- Java Development Kit (JDK): Ensure JDK is installed on your system.
- Java Runtime Environment (JRE): Required for running the compiled program.

**Clone the Repository:**
*https://github.com/Velang2003/JAVA-URL-Convertor.git*

**Compile the Program:**
*javac LinkShortener.java CLI.java*

**Run the Program:**
*java LinkShortener*

# Usage
## Command-Line Interface
The program provides a simple CLI for user interaction:
Shorten URL:
Choose option 1 to shorten a long URL.
Enter the long URL when prompted.
Expand URL:
Choose option 2 to expand a short URL.
Enter the short URL when prompted.
Exit:
Choose option 3 to exit the program.

## Example Interaction
- Shorten URL
- Expand URL
- Exit
- Choose an option: 1
- Enter the long URL: https://www.example.com/very/long/url
- Short URL: abc123

- Shorten URL
- Expand URL
- Exit
- Choose an option: 2
- Enter the short URL: abc123
- Long URL: https://www.example.com/very/long/url

