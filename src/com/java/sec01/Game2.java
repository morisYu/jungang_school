package com.java.sec01;

/*
 * ����, ����, �� ���� �����
 * ���ڸ� �Է¹޾Ƽ� ��ǻ�Ϳ� ���������� ����
 * 1��1�� ���������� ����, 2��1�� ���������� ����
 * �ڵ带 �ִ��� �����ϰ� ���� ��� ������ ��(�ݺ��� Ȱ��)
 */
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] result = new String[] { "����", "����", "��" };

		while (true) {
			int user = 0;
			int com1 = 0;
			int com2 = 0;

			System.out.println("��.. ������ ��������");
			System.out.print("�÷��̾� ���� �Է��Ͻÿ� >");
			user = scanner.nextInt();
			if (user == 1) {
				System.out.println("��ǻ�Ϳ� 1��1 �ºθ� ���ϴ±�");
				System.out.println();
				while (true) {
					System.out.println("1: ���� / 2: ���� / 3: ��");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					if (user == com1) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("���º�");
						break;
					} else if (user > com1 || (user == 0 && com1 == 2)) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("�̰屺");
						break;
					} else {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("Looser");
						break;
					}
				}

			} else if (user == 2) {
				System.out.println("�� ��ǻ�͸� ����ϱ�� �����ٵ�");
				System.out.println();
				while (true) {
					System.out.println("1: ���� / 2: ���� / 3: ��");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					com2 = (int) (Math.random() * 3);
					if ((user == com1 && user == com2) || (user != com1 && user != com2 && com1 != com2)) {
						System.out.println(
								"user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > " + result[com2]);
						System.out.println("���º�");
						break;
					}

					// user �¸�
					if (user == 0) {
						if (com1 == 2 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user �¸�!!");
						} else if (com1 == 0 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user �¸�!!");
						} else if (com1 == 2 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user �¸�!!");
						} else {
							// com1 �¸�
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							} else if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							} else if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							} // com1 �¸�
						}
						break;
					}
					if (user == 1) {
						if (com1 == 0 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user �¸�!!");
						} else if (com1 == 1 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user �¸�!!");
						} else if (com1 == 0 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user �¸�!!");
						} else {
							// com1 �¸�
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							}
							if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							}
							if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							} // com1 �¸�
						}
						break;
					}
					if (user == 2) {
						if (com1 == 1 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user �¸�!!");
						} else if (com1 == 2 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user �¸�!!");
						} else if (com1 == 1 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user �¸�!!");
						} else {
							// com1 �¸�
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							}
							if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							}
							if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 �¸�!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 �¸�!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user �¸�!!");
								} else {
									// com2 �¸�
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 �¸�!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 �¸�!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user �¸�!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 �¸�
								}
								break;
							} // com1 �¸�
						}
						break;
					} // user �¸�

				}

			} else if (user == 0) {
				System.out.println("�߰���");
				break;
			} else {
				System.out.println("0 : �׸��ϱ� / 1 : 1��1 / 2 : 2��1");
				continue;
			}
			System.out.println();
		}
		System.out.println("Program OFF");
	}
}
