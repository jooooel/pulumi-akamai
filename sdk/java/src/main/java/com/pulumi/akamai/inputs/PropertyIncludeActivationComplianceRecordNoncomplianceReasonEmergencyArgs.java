// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs Empty = new PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs();

    @Import(name="ticketId")
    private @Nullable Output<String> ticketId;

    public Optional<Output<String>> ticketId() {
        return Optional.ofNullable(this.ticketId);
    }

    private PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs() {}

    private PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs(PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs $) {
        this.ticketId = $.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs $;

        public Builder() {
            $ = new PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs();
        }

        public Builder(PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs defaults) {
            $ = new PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs(Objects.requireNonNull(defaults));
        }

        public Builder ticketId(@Nullable Output<String> ticketId) {
            $.ticketId = ticketId;
            return this;
        }

        public Builder ticketId(String ticketId) {
            return ticketId(Output.of(ticketId));
        }

        public PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergencyArgs build() {
            return $;
        }
    }

}