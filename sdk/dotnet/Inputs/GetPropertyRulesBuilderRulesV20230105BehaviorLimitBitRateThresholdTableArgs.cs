// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTableInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("thresholdUnit")]
        public Input<string>? ThresholdUnit { get; set; }

        [Input("thresholdValue")]
        public Input<int>? ThresholdValue { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTableInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTableInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTableInputArgs();
    }
}