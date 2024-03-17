package com.github.dreamolight.jnpy;

public enum Endian {
	host {
		@Override
		public String toString() {
			return "=";
		}
	},
	big {
		@Override
		public String toString() {
			return ">";
		}
	},
	little {
		@Override
		public String toString() {
			return "<";
		}
	},
	na {
		@Override
		public String toString() {
			return "|";
		}
	}
}

