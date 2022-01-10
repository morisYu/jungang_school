package exam220110;
/*
 * 5 명의 국어, 영어, 수학 점수를 랜덤으로 추출하고
 * (각 과목의 점수는 99점 만점으로 바꿈(100점 나오면 표가 안 예쁨)
 * 과목 총 합계와 평균(소수점 2자리에서 반올림)을 구하고
 * 점수 합계를 이용하여 5 명의 석차를 구할 것
 * (동점인 경우는 고려하지 않음)
 * 배열 사용하지 않고 구현할 것
 */

public class TestScore {

	public static void main(String[] args) {
		// 변수 선언
		// 김유신 점수
		int kor1 = (int) (Math.random() * 40) + 60;
		int eng1 = (int) (Math.random() * 40) + 60;
		int math1 = (int) (Math.random() * 40) + 60;
		int sum1 = kor1 + eng1 + math1;
		double avg1 = (double) sum1 / 3.0;
		double avgF1;
		int avgP11 = (int) (avg1 * 100);
		int avgP12 = (int) (avg1 * 10) * 10;
		// 평균을 소수점 한자리로 반올림
		if ((avgP11 - avgP12) < 5) {
			avgF1 = avgP12 / 100.0;
		} else {
			avgF1 = (avgP12 + 10) / 100.0;
		}
		int rank1 = 0;

		// 강감찬 점수
		int kor2 = (int) (Math.random() * 40) + 60;
		int eng2 = (int) (Math.random() * 40) + 60;
		int math2 = (int) (Math.random() * 40) + 60;
		int sum2 = kor2 + eng2 + math2;
		double avg2 = (double) sum2 / 3.0;
		double avgF2;
		int avgP21 = (int) (avg2 * 100);
		int avgP22 = (int) (avg2 * 10) * 10;
		// 평균을 소수점 한자리로 반올림
		if ((avgP21 - avgP22) < 5) {
			avgF2 = avgP22 / 100.0;
		} else {
			avgF2 = (avgP22 + 10) / 100.0;
		}
		int rank2 = 0;

		// 이순신 점수
		int kor3 = (int) (Math.random() * 40) + 60;
		int eng3 = (int) (Math.random() * 40) + 60;
		int math3 = (int) (Math.random() * 40) + 60;
		int sum3 = kor3 + eng3 + math3;
		double avg3 = (double) sum3 / 3.0;
		double avgF3;
		int avgP31 = (int) (avg3 * 100);
		int avgP32 = (int) (avg3 * 10) * 10;
		// 평균을 소수점 한자리로 반올림
		if ((avgP31 - avgP32) < 5) {
			avgF3 = avgP32 / 100.0;
		} else {
			avgF3 = (avgP32 + 10) / 100.0;
		}
		int rank3 = 0;

		// 홍길동 점수
		int kor4 = (int) (Math.random() * 40) + 60;
		int eng4 = (int) (Math.random() * 40) + 60;
		int math4 = (int) (Math.random() * 40) + 60;
		int sum4 = kor4 + eng4 + math4;
		double avg4 = (double) sum4 / 3.0;
		double avgF4;
		int avgP41 = (int) (avg4 * 100);
		int avgP42 = (int) (avg4 * 10) * 10;
		// 평균을 소수점 한자리로 반올림
		if ((avgP41 - avgP42) < 5) {
			avgF4 = avgP42 / 100.0;
		} else {
			avgF4 = (avgP42 + 10) / 100.0;
		}
		int rank4 = 0;

		// 정약용 점수
		int kor5 = (int) (Math.random() * 40) + 60;
		int eng5 = (int) (Math.random() * 40) + 60;
		int math5 = (int) (Math.random() * 40) + 60;
		int sum5 = kor5 + eng5 + math5;
		double avg5 = (double) sum5 / 3.0;
		double avgF5;
		int avgP51 = (int) (avg5 * 100);
		int avgP52 = (int) (avg5 * 10) * 10;
		// 평균을 소수점 한자리로 반올림
		if ((avgP51 - avgP52) < 5) {
			avgF5 = avgP52 / 100.0;
		} else {
			avgF5 = (avgP52 + 10) / 100.0;
		}
		int rank5 = 0;

		// 등수 처리
		if (sum1 < sum2) { // (sum1 < sum2)
			if (sum1 < sum3) { // (sum1 < sum2)&(sum1 < sum3)
				if (sum1 < sum4) { // (sum1 < sum2)&(sum1 < sum3)&(sum1 < sum4)
					if (sum1 < sum5) { // (sum1 < sum2)&(sum1 < sum3)&(sum1 < sum4)&(sum1 < sum5)
						rank1 = 5;
						if (sum2 < sum3) { // rank1 = 5;&(sum2 < sum3)
							if (sum2 < sum4) { // rank1 = 5;&(sum2 < sum3)&(sum2 < sum4)
								if (sum2 < sum5) { // rank1 = 5;&(sum2 < sum3)&(sum2 < sum4)&(sum2 < sum5)
									rank2 = 4;
									if (sum3 < sum4) { // rank1 = 5;rank2 = 4;(sum3 < sum4)
										if (sum3 < sum5) { // rank1 = 5;rank2 = 4;(sum3 < sum4)&(sum3 < sum5)
											rank3 = 3;
											if (sum4 < sum5) { // rank1 = 5;rank2 = 4;rank3 = 3;&(sum4 < sum5)
												rank4 = 2;
												rank5 = 1;
											} else { // rank1 = 5;rank2 = 4;rank3 = 3;&(sum5 < sum4)
												rank5 = 2;
												rank4 = 1;
											}
										} else { // rank1 = 5;rank2 = 4;(sum3 < sum4)&(sum5 < sum3)
											rank5 = 3;
											rank3 = 2;
											rank4 = 1;
										}
									} else { // rank1 = 5;rank2 = 4;(sum4 < sum3)
										if (sum4 < sum5) { // rank1 = 5;rank2 = 4;(sum4 < sum3)&(sum4 < sum5)
											rank4 = 3;
											if (sum3 < sum5) { // rank1 = 5;rank2 = 4;rank4 = 3;&(sum3 < sum5)
												rank3 = 2;
												rank5 = 1;
											} else { // rank1 = 5;rank2 = 4;rank4 = 3;&(sum5 < sum3)
												rank5 = 2;
												rank3 = 1;
											}
										} else { // rank1 = 5;rank2 = 4;(sum4 < sum3)&(sum5 < sum4)
											rank5 = 3;
											rank4 = 2;
											rank3 = 1;
										}
									}
								} else { // rank1 = 5;&(sum2 < sum3)&(sum2 < sum4)&(sum5 < sum2)
									rank5 = 4;
									rank2 = 3;
									if (sum3 < sum4) { // rank1 = 5;rank5 = 4;rank2 = 3;&(sum3 < sum4)
										rank3 = 2;
										rank4 = 1;
									} else { // rank1 = 5;rank5 = 4;rank2 = 3;&(sum4 < sum3)
										rank3 = 1;
										rank4 = 2;
									}
								}
							} else { // rank1 = 5;&(sum2 < sum3)&(sum4 < sum2)
								if (sum2 < sum5) { // rank1 = 5;&(sum2 < sum3)&(sum4 < sum2)&(sum2 < sum5)
									rank4 = 4;
									rank2 = 3;
									if (sum3 < sum5) { // rank1 = 5;rank4 = 4;rank2 = 3;(sum3 < sum5)
										rank3 = 2;
										rank5 = 1;
									} else { // rank1 = 5;rank4 = 4;rank2 = 3;(sum5 < sum3)
										rank5 = 1;
										rank3 = 2;
									}
								} else { // rank1 = 5;&(sum2 < sum3)&(sum4 < sum2)&(sum5 < sum2)
									rank3 = 1;
									rank2 = 2;
									if (sum4 < sum5) { // rank1 = 5;rank2 = 2;rank3 = 1;(sum4 < sum5)
										rank4 = 4;
										rank5 = 3;
									} else { // rank1 = 5;rank2 = 2;rank3 = 1;(sum5 < sum4)
										rank5 = 4;
										rank4 = 3;
									}
								}

							}
						} else { // rank1 = 5;&(sum3 < sum2)
							if (sum2 < sum4) { // rank1 = 5;&(sum3 < sum2)&(sum2 < sum4)
								if (sum2 < sum5) { // rank1 = 5;&(sum3 < sum2)&(sum2 < sum4)&(sum2 < sum5)
									rank3 = 4;
									rank2 = 3;
									if (sum4 < sum5) { // rank1 = 5;rank3 = 4;rank2 = 3;&(sum4 < sum5)
										rank4 = 2;
										rank5 = 1;
									} else { // rank1 = 5;rank3 = 4;rank2 = 3;&(sum5 < sum4)
										rank5 = 2;
										rank4 = 1;
									}
								} else { // rank1 = 5;&(sum3 < sum2)&(sum2 < sum4)&(sum5 < sum2)
									rank4 = 1;
									rank2 = 2;
									if (sum3 < sum5) { // rank1 = 5;rank2 = 2;rank4 = 1;&(sum3 < sum5)
										rank5 = 3;
										rank3 = 4;
									} else { // rank1 = 5;rank2 = 2;rank4 = 1;&(sum5 < sum3)
										rank3 = 3;
										rank5 = 4;
									}
								}
							} else { // rank1 = 5;(sum3 < sum2)&(sum4 < sum2)
								if (sum2 < sum5) { // rank1 = 5;(sum3 < sum2)&(sum4 < sum2)&(sum2 < sum5)
									rank5 = 1;
									rank2 = 2;
									if (sum3 < sum4) { // rank1 = 5;rank2 = 2;rank5 = 1;&(sum3 < sum4)
										rank4 = 3;
										rank3 = 4;
									} else { // rank1 = 5;rank2 = 2;rank5 = 1;&(sum4 < sum3)
										rank3 = 3;
										rank4 = 4;
									}
								} else { // rank1 = 5;(sum3 < sum2)&(sum4 < sum2)&(sum5 < sum2)
									rank2 = 1;
									if (sum3 < sum4) { // rank1 = 5;rank2 = 1;&(sum3 < sum4)
										if (sum3 < sum5) { // rank1 = 5;rank2 = 1;&(sum3 < sum4)&(sum3 < sum5)
											rank3 = 4;
											if (sum4 < sum5) { // rank1 = 5;rank2 = 1;rank3 = 4;&(sum4 < sum5)
												rank4 = 3;
												rank5 = 2;
											}
										} else { // rank1 = 5;rank2 = 1;&(sum3 < sum4)&(sum5 < sum3)
											rank5 = 4;
											rank3 = 3;
											rank4 = 2;
										}
									} else { // rank1 = 5;rank2 = 1;&(sum4 < sum3)
										if (sum3 < sum5) { // rank1 = 5;rank2 = 1;&(sum4 < sum3)&(sum3 < sum5)
											rank5 = 2;
											rank3 = 3;
											rank4 = 4;
										} else { // rank1 = 5;rank2 = 1;&(sum4 < sum3)&(sum5 < sum3)
											rank3 = 2;
											if (sum4 < sum5) { // rank1 = 5;rank2 = 1;rank3 = 2;&(sum4 < sum5)
												rank5 = 3;
												rank4 = 4;
											} else { // rank1 = 5;rank2 = 1;rank3 = 2;&(sum5 < sum4)
												rank4 = 3;
												rank5 = 4;
											}
										}
									}
								}
							}
						}
					} else { // (sum1 < sum2)&(sum1 < sum3)&(sum1 < sum4)&(sum5 < sum1)
						rank5 = 5;
						rank1 = 4;
						if (sum2 < sum3) { // rank5=5;rank1=4;&(sum2<sum3)
							if (sum2 < sum4) { // rank5=5;rank1=4;&(sum2<sum3)&(sum2<sum4)
								rank2 = 3;
								if (sum3 < sum4) { // rank5=5;rank1=4;rank2=3;&(sum3<sum4)
									rank3 = 2;
									rank4 = 1;
								} else { // rank5=5;rank1=4;rank2=3;&(sum4<sum3)
									rank4 = 2;
									rank3 = 1;
								}
							} else { // rank5=5;rank1=4;&(sum2<sum3)&(sum4<sum2)
								rank4 = 3;
								rank2 = 2;
								rank3 = 1;
							}
						} else { // rank5=5;rank1=4;&(sum3<sum2)
							if (sum2 < sum4) { // rank5=5;rank1=4;&(sum3<sum2)&(sum2 < sum4)
								rank3 = 3;
								rank2 = 2;
								rank4 = 1;
							} else { // rank5=5;rank1=4;&(sum3<sum2)&(sum4 < sum2)
								rank2 = 1;
								if (sum3 < sum4) { // rank5=5;rank1=4;rank2 = 1;&(sum3 < sum4)
									rank3 = 3;
									rank4 = 2;
								} else { // rank5=5;rank1=4;rank2 = 1;&(sum4 < sum3)
									rank4 = 3;
									rank3 = 2;
								}
							}
						}
					}
				} else { // (sum1 < sum2)&(sum1 < sum3)&(sum4 < sum1)
					if (sum1 < sum5) { // (sum1 < sum2)&(sum1 < sum3)&(sum4 < sum1)&(sum1 < sum5)
						rank4 = 5;
						rank1 = 4;
						if (sum2 < sum5) { // rank4 = 5;rank1 = 4;(sum2 < sum5)
							if (sum2 < sum3) { // rank4 = 5;rank1 = 4;(sum2 < sum5)&(sum2 < sum3)
								rank2 = 3;
								if (sum3 < sum5) { // rank4 = 5;rank1 = 4;rank2 = 3;(sum3 < sum5)
									rank3 = 2;
									rank5 = 1;
								} else { // rank4 = 5;rank1 = 4;rank2 = 3;(sum5 < sum3)
									rank5 = 2;
									rank3 = 1;
								}
							} else { // rank4 = 5;rank1 = 4;(sum2 < sum5)&(sum3 < sum2)
								rank3 = 3;
								rank2 = 2;
								rank5 = 1;
							}
						} else { // rank4 = 5;rank1 = 4;(sum5 < sum2)
							if (sum2 < sum3) { // rank4 = 5;rank1 = 4;(sum5 < sum2)&(sum2 < sum3)
								rank5 = 3;
								rank2 = 2;
								rank3 = 1;
							} else { // rank4 = 5;rank1 = 4;(sum5 < sum2)&(sum3 < sum2)
								rank2 = 1;
								if (sum3 < sum5) { // rank4 = 5;rank1 = 4;rank2 = 1;(sum3 < sum5)
									rank3 = 3;
									rank5 = 2;
								} else { // rank4 = 5;rank1 = 4;rank2 = 1;(sum5 < sum3)
									rank3 = 2;
									rank5 = 3;
								}
							}
						}
					} else { // (sum1 < sum2)&(sum1 < sum3)&(sum4 < sum1)&(sum5 < sum1)
						rank1 = 3;
						if (sum4 < sum5) { // (sum1 < sum2)&(sum1 < sum3)&rank1=3;(sum4 < sum5)
							rank4 = 5;
							rank5 = 4;
							if (sum2 < sum3) { // rank1 = 3;rank4 = 5;rank5 = 4;(sum2 < sum3)
								rank2 = 2;
								rank3 = 1;
							} else { // rank1 = 3;rank4 = 5;rank5 = 4;(sum3 < sum2)
								rank3 = 2;
								rank2 = 1;
							}
						} else { // (sum1 < sum2)&(sum1 < sum3)&rank1=3;(sum5 < sum4)
							rank5 = 5;
							rank4 = 4;
							if (sum2 < sum3) { // rank1 = 3;rank5 = 5;rank4 = 4;(sum2 < sum3)
								rank2 = 2;
								rank3 = 1;
							} else { // rank1 = 3;rank5 = 5;rank4 = 4;(sum3 < sum2)
								rank3 = 2;
								rank2 = 1;
							}
						}
					}
				}
			} else { // (sum1 < sum2)&(sum3 < sum1)
				if (sum1 < sum4) { // (sum1 < sum2)&(sum3 < sum1)&(sum1 < sum4)
					if (sum1 < sum5) { // (sum1 < sum2)&(sum3 < sum1)&(sum1 < sum4)&(sum1 < sum5)
						rank3 = 5;
						rank1 = 4;
						if (sum2 < sum4) { // rank3 = 5;rank1 = 4;(sum2 < sum4)
							if (sum2 < sum5) { // rank3 = 5;rank1 = 4;(sum2 < sum4)&(sum2 < sum5)
								rank2 = 3;
								if (sum4 < sum5) { // rank3 = 5;rank1 = 4;rank2 = 3;(sum4 < sum5)
									rank4 = 2;
									rank5 = 1;
								} else { // rank3 = 5;rank1 = 4;rank2 = 3;(sum5 < sum4)
									rank5 = 2;
									rank4 = 1;
								}
							} else { // rank3 = 5;rank1 = 4;(sum2 < sum4)&(sum5 < sum2)
								rank5 = 3;
								rank2 = 2;
								rank4 = 1;
							}
						} else { // rank3 = 5;rank1 = 4;(sum4 < sum2)
							if (sum2 < sum5) { // rank3 = 5;rank1 = 4;(sum4 < sum2)&(sum2 < sum5)
								rank5 = 1;
								rank2 = 2;
								rank4 = 3;
							} else { // rank3 = 5;rank1 = 4;(sum4 < sum2)&(sum5 < sum2)
								rank2 = 1;
								if (sum4 < sum5) { // rank3 = 5;rank1 = 4;rank2 = 1;(sum4 < sum5)
									rank4 = 3;
									rank5 = 2;
								} else { // rank3 = 5;rank1 = 4;rank2 = 1;(sum5 < sum4)
									rank4 = 2;
									rank5 = 3;
								}
							}

						}
					} else { // (sum1 < sum2)&(sum3 < sum1)&(sum1 < sum4)&(sum5 < sum1)
						rank1 = 3;
						if (sum3 < sum5) { // (sum3 < sum1)&(sum5 < sum1)&rank1=3;(sum3 < sum5)
							rank3 = 5;
							rank5 = 4;
							if (sum2 < sum4) { // rank1 = 3;rank3 = 5;rank5 = 4;(sum2 < sum4)
								rank2 = 2;
								rank4 = 1;
							} else { // rank1 = 3;rank3 = 5;rank5 = 4;(sum4 < sum2)
								rank2 = 1;
								rank4 = 2;
							}
						} else { // (sum3 < sum1)&(sum5 < sum1)&rank1=3;(sum5 < sum3)
							rank5 = 5;
							rank3 = 4;
							if (sum2 < sum4) { // rank1 = 3;rank5 = 5;rank3 = 4;(sum2 < sum4)
								rank2 = 2;
								rank4 = 1;
							} else { // rank1 = 3;rank5 = 5;rank3 = 4;(sum4 < sum2)
								rank2 = 1;
								rank4 = 2;
							}
						}
					}

				} else { // (sum1 < sum2)&(sum3 < sum1)&(sum4 < sum1)
					if (sum1 < sum5) { // (sum1 < sum2)&(sum3 < sum1)&(sum4 < sum1)&(sum1 < sum5)
						rank1 = 3;
						if (sum3 < sum4) { // (sum3 < sum1)&(sum4 < sum1)&rank1 = 3;(sum3 < sum4)
							rank3 = 5;
							rank4 = 4;
							if (sum2 < sum5) { // rank1 = 3;rank3 = 5;rank4 = 4;(sum2 < sum5)
								rank2 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank3 = 5;rank4 = 4;(sum5 < sum2)
								rank5 = 2;
								rank2 = 1;
							}
						} else { // (sum3 < sum1)&(sum4 < sum1)&rank1 = 3;(sum4 < sum3)
							rank3 = 4;
							rank4 = 5;
							if (sum2 < sum5) { // rank1 = 3;rank3 = 4;rank4 = 5;(sum2 < sum5)
								rank2 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank3 = 4;rank4 = 5;(sum5 < sum2)
								rank5 = 2;
								rank2 = 1;
							}
						}
					} else { // (sum1 < sum2)&(sum3 < sum1)&(sum4 < sum1)&(sum5 < sum1)
						rank2 = 1;
						rank1 = 2;
						if (sum3 < sum4) { // rank2 = 1;rank1 = 2;(sum3 < sum4)
							if (sum3 < sum5) { // rank2 = 1;rank1 = 2;(sum3 < sum4)&(sum3 < sum5)
								rank3 = 5;
								if (sum4 < sum5) { // rank2 = 1;rank1 = 2;rank3 = 5;(sum4 < sum5)
									rank4 = 4;
									rank5 = 3;
								} else { // rank2 = 1;rank1 = 2;rank3 = 5;(sum5 < sum4)
									rank4 = 3;
									rank5 = 4;
								}
							} else { // rank2 = 1;rank1 = 2;(sum3 < sum4)&(sum5 < sum3)
								rank5 = 5;
								rank3 = 4;
								rank4 = 3;
							}
						} else { // rank2 = 1;rank1 = 2;(sum4 < sum3)
							if (sum3 < sum5) { // rank2 = 1;rank1 = 2;(sum4 < sum3)&(sum3 < sum5)
								rank4 = 5;
								rank3 = 4;
								rank5 = 3;
							} else { // rank2 = 1;rank1 = 2;(sum4 < sum3)&(sum5 < sum3)
								rank3 = 3;
								if (sum4 < sum5) { // rank2 = 1;rank1 = 2;rank3 = 3;(sum4 < sum5)
									rank4 = 5;
									rank5 = 4;
								} else { // rank2 = 1;rank1 = 2;rank3 = 3;(sum5 < sum4)
									rank4 = 4;
									rank5 = 5;
								}
							}
						}
					}
				}
			}
		}

		else { // (sum2 < sum1)
			if (sum1 < sum3) { // (sum2 < sum1)&(sum1 < sum3)
				if (sum1 < sum4) { // (sum2 < sum1)&(sum1 < sum3)&(sum1 < sum4)
					if (sum1 < sum5) { // (sum2 < sum1)&(sum1 < sum3)&(sum1 < sum4)&(sum1 < sum5)
						rank2 = 5;
						rank1 = 4;
						if (sum3 < sum4) { // rank2 = 5;rank1 = 4;(sum3 < sum4)
							if (sum3 < sum5) { // rank2 = 5;rank1 = 4;(sum3 < sum4)&(sum3 < sum5)
								rank3 = 3;
								if (sum4 < sum5) { // rank2 = 5;rank1 = 4;rank3 = 3;(sum4 < sum5)
									rank4 = 2;
									rank5 = 1;
								} else { // rank2 = 5;rank1 = 4;rank3 = 3;(sum5 < sum4)
									rank5 = 2;
									rank4 = 1;
								}
							} else { // rank2 = 5;rank1 = 4;(sum3 < sum4)&(sum5 < sum3)
								rank5 = 3;
								rank3 = 2;
								rank4 = 1;
							}
						} else { // rank2 = 5;rank1 = 4;(sum4 < sum3)
							if (sum3 < sum5) { // rank2 = 5;rank1 = 4;(sum4 < sum3)&(sum3 < sum5)
								rank4 = 3;
								rank3 = 2;
								rank5 = 1;
							} else { // rank2 = 5;rank1 = 4;(sum4 < sum3)&(sum5 < sum3)
								rank3 = 1;
								if (sum4 < sum5) { // rank2 = 5;rank1 = 4;rank3 = 1;(sum4 < sum5)
									rank5 = 2;
									rank4 = 3;
								} else { // rank2 = 5;rank1 = 4;rank3 = 1;(sum5 < sum4)
									rank4 = 2;
									rank5 = 3;
								}
							}
						}
					} else { // (sum2 < sum1)&(sum1 < sum3)&(sum1 < sum4)&(sum5 < sum1)
						if (sum2 < sum5) { // (sum2 < sum1)&(sum1 < sum3)&(sum1 < sum4)&(sum5 < sum1)&(sum2 < sum5)
							rank2 = 5;
							rank5 = 4;
							rank1 = 3;
							if (sum3 < sum4) { // rank2 = 5;rank5 = 4;rank1 = 3;(sum3 < sum4)
								rank3 = 2;
								rank4 = 1;
							} else { // rank2 = 5;rank5 = 4;rank1 = 3;(sum4 < sum3)
								rank4 = 2;
								rank3 = 1;
							}
						} else { // (sum2 < sum1)&(sum1 < sum3)&(sum1 < sum4)&(sum5 < sum1)&(sum5 < sum2)
							rank5 = 5;
							rank2 = 4;
							rank1 = 3;
							if (sum3 < sum4) { // rank5 = 5;rank2 = 4;rank1 = 3;(sum3 < sum4)
								rank3 = 2;
								rank4 = 1;
							} else { // rank5 = 5;rank2 = 4;rank1 = 3;(sum4 < sum3)
								rank4 = 2;
								rank3 = 1;
							}
						}
					}
				} else { // (sum2 < sum1)&(sum1 < sum3)&(sum4 < sum1)
					if (sum1 < sum5) { // (sum2 < sum1)&(sum1 < sum3)&(sum4 < sum1)&(sum1 < sum5)
						rank1 = 3;
						if (sum2 < sum4) { // (sum2 < sum1)&(sum4 < sum1)&rank1 = 3;(sum2 < sum4)
							rank2 = 5;
							rank4 = 4;
							if (sum3 < sum5) { // rank1 = 3;rank2 = 5;rank4 = 4;(sum3 < sum5)
								rank3 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank2 = 5;rank4 = 4;(sum5 < sum3)
								rank3 = 1;
								rank5 = 2;
							}
						} else { // (sum2 < sum1)&(sum4 < sum1)&rank1 = 3;(sum4 < sum2)
							rank4 = 5;
							rank2 = 4;
							if (sum3 < sum5) { // rank1 = 3;rank4=5;rank2 = 4;(sum3<sum5)
								rank3 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank4=5;rank2 = 4;(sum5<sum3)
								rank5 = 2;
								rank3 = 1;
							}
						}
					} else { // (sum2 < sum1)&(sum1 < sum3)&(sum4 < sum1)&(sum5 < sum1)
						rank3 = 1;
						rank1 = 2;
						if (sum2 < sum4) { // rank3 = 1;rank1 = 2;(sum2 < sum4)
							if (sum2 < sum5) { // rank3 = 1;rank1 = 2;(sum2 < sum4)&(sum2 < sum5)
								rank2 = 5;
								if (sum4 < sum5) { // rank3 = 1;rank1 = 2;rank2 = 5;(sum4 < sum5)
									rank4 = 4;
									rank5 = 3;
								} else { // rank3 = 1;rank1 = 2;rank2 = 5;(sum5 < sum4)
									rank4 = 3;
									rank5 = 4;
								}
							} else { // rank3 = 1;rank1 = 2;(sum2 < sum4)&(sum5 < sum2)
								rank5 = 5;
								rank2 = 4;
								rank4 = 3;
							}
						} else { // rank3 = 1;rank1 = 2;(sum4 < sum2)
							if (sum2 < sum5) { // rank3 = 1;rank1 = 2;(sum4 < sum2)&(sum2 < sum5)
								rank4 = 5;
								rank2 = 4;
								rank5 = 3;
							} else { // rank3 = 1;rank1 = 2;(sum4 < sum2)&(sum5 < sum2)
								rank2 = 3;
								if (sum4 < sum5) { // rank3 = 1;rank1 = 2;rank2 = 3;(sum4 < sum5)
									rank4 = 5;
									rank5 = 4;
								} else { // rank3 = 1;rank1 = 2;rank2 = 3;(sum5 < sum4)
									rank4 = 4;
									rank5 = 5;
								}
							}
						}
					}
				}
			} else { // (sum2 < sum1)&(sum3 < sum1)
				if (sum1 < sum4) { // (sum2 < sum1)&(sum3 < sum1)&(sum1 < sum4)
					if (sum1 < sum5) { // (sum2 < sum1)&(sum3 < sum1)&(sum1 < sum4)&(sum1 < sum5)
						rank1 = 3;
						if (sum2 < sum3) { // (sum2 < sum1)&(sum3 < sum1)&rank1 = 3;(sum2 < sum3)
							rank2 = 5;
							rank3 = 4;
							if (sum4 < sum5) { // rank1 = 3;rank2 = 5;rank3 = 4;(sum4 < sum5)
								rank4 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank2 = 5;rank3 = 4;(sum5 < sum4)
								rank5 = 2;
								rank4 = 1;
							}
						} else { // (sum2 < sum1)&(sum3 < sum1)&rank1 = 3;(sum3 < sum2)
							rank2 = 4;
							rank3 = 5;
							if (sum4 < sum5) { // rank1 = 3;rank2 = 4;rank3 = 5;(sum4 < sum5)
								rank4 = 2;
								rank5 = 1;
							} else { // rank1 = 3;rank2 = 4;rank3 = 5;(sum5 < sum4)
								rank5 = 2;
								rank4 = 1;
							}
						}
					} else { // (sum2 < sum1)&(sum3 < sum1)&(sum1 < sum4)&(sum5 < sum1)
						rank4 = 1;
						rank1 = 2;
						if (sum2 < sum3) { // rank4 = 1;rank1 = 2;(sum2 < sum3)
							if (sum2 < sum5) { // rank4 = 1;rank1 = 2;(sum2 < sum3)&(sum2 < sum5)
								rank2 = 5;
								if (sum3 < sum5) { // rank4 = 1;rank1 = 2;rank2 = 5;(sum3 < sum5)
									rank5 = 3;
									rank3 = 4;
								} else { // rank4 = 1;rank1 = 2;rank2 = 5;(sum5 < sum3)
									rank3 = 3;
									rank5 = 4;
								}
							} else { // rank4 = 1;rank1 = 2;(sum2 < sum3)&(sum5 < sum2)
								rank5 = 5;
								rank2 = 4;
								rank3 = 3;
							}
						} else { // rank4 = 1;rank1 = 2;(sum3 < sum2)
							if (sum2 < sum5) { // rank4 = 1;rank1 = 2;(sum3 < sum2)&(sum2 < sum5)
								rank3 = 5;
								rank2 = 4;
								rank5 = 3;
							} else { // rank4 = 1;rank1 = 2;(sum3 < sum2)&(sum5 < sum2)
								rank2 = 3;
								if (sum3 < sum5) { // rank4 = 1;rank1 = 2;rank2 = 3;(sum3 < sum5)
									rank3 = 5;
									rank5 = 4;
								} else { // rank4 = 1;rank1 = 2;rank2 = 3;(sum5 < sum3)
									rank5 = 5;
									rank3 = 4;
								}
							}
						}
					}
				} else { // (sum2 < sum1)&(sum3 < sum1)&(sum4 < sum1)
					if (sum1 < sum5) { // (sum2 < sum1)&(sum3 < sum1)&(sum4 < sum1)&(sum1 < sum5)
						rank5 = 1;
						rank1 = 2;
						if (sum2 < sum3) { // (sum2 < sum1)&(sum3 < sum1)&rank5 = 1;rank1 = 2;(sum2 < sum3)
							if (sum2 < sum4) { // rank5 = 1;rank1 = 2;(sum2 < sum3)&(sum2 < sum4)
								rank2 = 5;
								if (sum3 < sum4) { // rank5 = 1;rank1 = 2;rank2 = 5;(sum3 < sum4)
									rank3 = 4;
									rank4 = 3;
								} else { // rank5 = 1;rank1 = 2;rank2 = 5;(sum4 < sum3)
									rank3 = 3;
									rank4 = 4;
								}
							} else { // rank5 = 1;rank1 = 2;(sum2 < sum3)&(sum4 < sum2)
								rank4 = 5;
								rank2 = 4;
								rank3 = 3;
							}
						} else { // (sum2 < sum1)&(sum3 < sum1)&rank5 = 1;rank1 = 2;(sum3 < sum2)
							if (sum2 < sum4) { // rank5 = 1;rank1 = 2;(sum3 < sum2)&(sum2 < sum4)
								rank3 = 5;
								rank2 = 4;
								rank4 = 3;
							} else { // rank5 = 1;rank1 = 2;(sum3 < sum2)&(sum4 < sum2)
								rank2 = 3;
								if (sum3 < sum4) { // rank5 = 1;rank1 = 2;rank2 = 3;(sum3 < sum4)
									rank3 = 5;
									rank4 = 4;
								} else { // rank5 = 1;rank1 = 2;rank2 = 3;(sum4 < sum3)
									rank3 = 4;
									rank4 = 5;
								}
							}
						}
					} else { // (sum2 < sum1)&(sum3 < sum1)&(sum4 < sum1)&(sum5 < sum1)
						rank1 = 1;
						if (sum2 < sum3) { // rank1 = 1;(sum2 < sum3)
							if (sum2 < sum4) { // rank1 = 1;(sum2 < sum3)&(sum2 < sum4)
								if (sum2 < sum5) { // rank1 = 1;(sum2 < sum3)&(sum2 < sum4)&(sum2 < sum5)
									rank2 = 5;
									if (sum3 < sum4) { // rank1 = 1;rank2 = 5;(sum3 < sum4)
										if (sum3 < sum5) { // rank1 = 1;rank2 = 5;(sum3 < sum4)&(sum3 < sum5)
											rank3 = 4;
											if (sum4 < sum5) { // rank1 = 1;rank2 = 5;rank3 = 4;(sum4 < sum5)
												rank4 = 3;
												rank5 = 2;
											} else { // rank1 = 1;rank2 = 5;rank3 = 4;(sum5 < sum4)
												rank4 = 2;
												rank5 = 3;
											}
										} else { // rank1 = 1;rank2 = 5;(sum3 < sum4)&(sum3 < sum5)
											rank3 = 4;
											if (sum4 < sum5) { // rank1 = 1;rank2 = 5;rank3 = 4;(sum4 < sum5)
												rank4 = 3;
												rank5 = 2;
											} else { // rank1 = 1;rank2 = 5;rank3 = 4;(sum5 < sum4)
												rank4 = 2;
												rank5 = 3;
											}
										}
									} else { // rank1 = 1;rank2 = 5;(sum4 < sum3)
										if (sum3 < sum5) { // rank1 = 1;rank2 = 5;(sum4 < sum3)&(sum3 < sum5)
											rank4 = 4;
											rank3 = 3;
											rank5 = 2;
										} else { // rank1 = 1;rank2 = 5;(sum4 < sum3)&(sum5 < sum3)
											rank3 = 2;
											if (sum4 < sum5) { // rank1 = 1;rank2 = 5;rank3 = 2;(sum4 < sum5)
												rank4 = 4;
												rank5 = 3;
											} else { // rank1 = 1;rank2 = 5;rank3 = 2;(sum5 < sum4)
												rank4 = 3;
												rank5 = 4;
											}
										}
									}
								} else { // rank1 = 1;(sum2 < sum3)&(sum2 < sum4)&(sum5 < sum2)
									rank5 = 5;
									rank2 = 4;
									if (sum3 < sum4) { // rank1 = 1;rank5 = 5;rank2 = 4;(sum3 < sum4)
										rank3 = 3;
										rank4 = 2;
									} else { // rank1 = 1;rank5 = 5;rank2 = 4;(sum4 < sum3)
										rank3 = 2;
										rank4 = 3;
									}
								}
							} else { // rank1 = 1;(sum2 < sum3)&(sum4 < sum2)
								if (sum2 < sum5) { // rank1 = 1;(sum2 < sum3)&(sum4 < sum2)&(sum2 < sum5)
									rank4 = 5;
									rank2 = 4;
									if (sum3 < sum5) { // rank1 = 1;rank4 = 5;rank2 = 4;(sum3 < sum5)
										rank5 = 2;
										rank3 = 3;
									} else { // rank1 = 1;rank4 = 5;rank2 = 4;(sum5 < sum3)
										rank5 = 3;
										rank3 = 2;
									}
								} else { // rank1 = 1;(sum2 < sum3)&(sum4 < sum2)&(sum5 < sum2)
									rank3 = 2;
									rank2 = 3;
									if (sum4 < sum5) { // rank1 = 1;rank3 = 2;rank2 = 3;(sum4 < sum5)
										rank4 = 5;
										rank5 = 4;
									} else { // rank1 = 1;rank3 = 2;rank2 = 3;(sum5 < sum4)
										rank4 = 4;
										rank5 = 5;
									}
								}
							}
						} else { // rank1 = 1;(sum3 < sum2)
							if (sum2 < sum4) { // rank1 = 1;(sum3 < sum2)&(sum2 < sum4)
								if (sum2 < sum5) { // rank1 = 1;(sum3 < sum2)&(sum2 < sum4)&(sum2 < sum5)
									rank3 = 5;
									rank2 = 4;
									if (sum4 < sum5) { // rank1 = 1;rank3 = 5;rank2 = 4; (sum4 < sum5)
										rank4 = 3;
										rank5 = 2;
									} else { // rank1 = 1;rank3 = 5;rank2 = 4; (sum5 < sum4)
										rank4 = 2;
										rank5 = 3;
									}
								} else { // rank1 = 1;(sum3 < sum2)&(sum2 < sum4)&(sum5 < sum2)
									rank4 = 2;
									rank2 = 3;
									if (sum3 < sum5) { // rank1 = 1;rank4 = 2;rank2 = 3;(sum3 < sum5)
										rank5 = 4;
										rank3 = 5;
									} else { // rank1 = 1;rank4 = 2;rank2 = 3;(sum5 < sum3)
										rank5 = 5;
										rank3 = 4;
									}
								}
							} else { // rank1 = 1;(sum3 < sum2)&(sum4 < sum2)
								if (sum2 < sum5) { // rank1 = 1;(sum3 < sum2)&(sum4 < sum2)&(sum2 < sum5)
									rank5 = 2;
									rank2 = 3;
									if (sum3 < sum4) { // rank1 = 1;rank5 = 2;rank2 = 3;(sum3 < sum4)
										rank3 = 5;
										rank4 = 4;
									} else { // rank1 = 1;rank5 = 2;rank2 = 3;(sum4 < sum3)
										rank3 = 4;
										rank4 = 5;
									}
								} else { // rank1 = 1;(sum3 < sum2)&(sum4 < sum2)&(sum5 < sum2)
									rank2 = 2;
									if (sum3 < sum4) { // rank1 = 1;rank2 = 2;(sum3 < sum4)
										if (sum3 < sum5) { // rank1 = 1;rank2 = 2;(sum3 < sum4)&(sum3 < sum5)
											rank3 = 5;
											if (sum4 < sum5) { // rank1 = 1;rank2 = 2;rank3 = 5;(sum4 < sum5)
												rank4 = 4;
												rank5 = 3;
											} else { // rank1 = 1;rank2 = 2;rank3 = 5;(sum5 < sum4)
												rank4 = 3;
												rank5 = 4;
											}
										} else { // rank1 = 1;rank2 = 2;(sum3 < sum4)&(sum5 < sum3)
											rank5 = 5;
											rank3 = 4;
											rank4 = 3;
										}
									} else { // rank1 = 1;rank2 = 2;(sum4 < sum3)
										if (sum3 < sum5) { // rank1 = 1;rank2 = 2;(sum4 < sum3)&(sum3 < sum5)
											rank4 = 5;
											rank3 = 4;
											rank5 = 3;
										} else { // rank1 = 1;rank2 = 2;(sum4 < sum3)&(sum5 < sum3)
											rank3 = 3;
											if (sum4 < sum5) { // rank1 = 1;rank2 = 2;rank3 = 3;(sum4 < sum5)
												rank4 = 5;
												rank5 = 4;
											} else { // rank1 = 1;rank2 = 2;rank3 = 3;(sum5 < sum4)
												rank4 = 4;
												rank5 = 5;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		// 출력 결과
		System.out.println("*********************************************");
		System.out.println("** 1. 과정명 : JAVA기반 S/W융합개발자과정A         **");
		System.out.println("** 2. 프로그램 제목 : 성적처리 프로그램             **");
		System.out.println("** 3. 개발자 성명 : 유 성 화                    **");
		System.out.println("*********************************************");
		System.out.println("이름    국어성적  영어성적  수학성적  합계    평균    등수 ");
		System.out.println("=============================================");
		System.out.println(
				"김유신     " + kor1 + "     " + eng1 + "     " + math1 + "    " + sum1 + "   " + avgF1 + "    " + rank1);
		System.out.println(
				"강감찬     " + kor2 + "     " + eng2 + "     " + math2 + "    " + sum2 + "   " + avgF2 + "    " + rank2);
		System.out.println(
				"이순신     " + kor3 + "     " + eng3 + "     " + math3 + "    " + sum3 + "   " + avgF3 + "    " + rank3);
		System.out.println(
				"홍길동     " + kor4 + "     " + eng4 + "     " + math4 + "    " + sum4 + "   " + avgF4 + "    " + rank4);
		System.out.println(
				"정약용     " + kor5 + "     " + eng5 + "     " + math5 + "    " + sum5 + "   " + avgF5 + "    " + rank5);
	}
}
