// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientlistListItem {
    private @Nullable String description;
    private @Nullable String expirationDate;
    private @Nullable List<String> tags;
    private String value;

    private ClientlistListItem() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientlistListItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String expirationDate;
        private @Nullable List<String> tags;
        private String value;
        public Builder() {}
        public Builder(ClientlistListItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expirationDate = defaults.expirationDate;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClientlistListItem build() {
            final var _resultValue = new ClientlistListItem();
            _resultValue.description = description;
            _resultValue.expirationDate = expirationDate;
            _resultValue.tags = tags;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
