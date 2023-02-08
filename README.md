# MockitoPerformance
Sample project to show performance degradation between Mockito 1.9.5 and 5.1.1.
Tested using Java 11 on Windows 10 22H2 laptop with i7 11th gen processor and 32GB RAM.
Tests were ran using Eclipse 22-12.
Below are my times when running the unit test from ServiceTest class:

| Mockito Version | JUnit Version | Time (ms) |
| ----------- | ----------- | ----------- |
| 1.9.5 | 4.12 | 3-5 |
| 1.9.5 | 4.13.2 | 70-80 |
| 5.1.1 | 4.12 | 120-130 |
| 5.1.1 | 4.13.2 | 120-130 |