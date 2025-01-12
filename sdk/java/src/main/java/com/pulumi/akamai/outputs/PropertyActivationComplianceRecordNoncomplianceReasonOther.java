// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertyActivationComplianceRecordNoncomplianceReasonOther {
    private @Nullable String otherNoncomplianceReason;
    private @Nullable String ticketId;

    private PropertyActivationComplianceRecordNoncomplianceReasonOther() {}
    public Optional<String> otherNoncomplianceReason() {
        return Optional.ofNullable(this.otherNoncomplianceReason);
    }
    public Optional<String> ticketId() {
        return Optional.ofNullable(this.ticketId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyActivationComplianceRecordNoncomplianceReasonOther defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String otherNoncomplianceReason;
        private @Nullable String ticketId;
        public Builder() {}
        public Builder(PropertyActivationComplianceRecordNoncomplianceReasonOther defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.otherNoncomplianceReason = defaults.otherNoncomplianceReason;
    	      this.ticketId = defaults.ticketId;
        }

        @CustomType.Setter
        public Builder otherNoncomplianceReason(@Nullable String otherNoncomplianceReason) {
            this.otherNoncomplianceReason = otherNoncomplianceReason;
            return this;
        }
        @CustomType.Setter
        public Builder ticketId(@Nullable String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public PropertyActivationComplianceRecordNoncomplianceReasonOther build() {
            final var _resultValue = new PropertyActivationComplianceRecordNoncomplianceReasonOther();
            _resultValue.otherNoncomplianceReason = otherNoncomplianceReason;
            _resultValue.ticketId = ticketId;
            return _resultValue;
        }
    }
}
