// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTableArgs : global::Pulumi.InvokeArgs
    {
        [Input("bitrateUnit")]
        public string? BitrateUnit { get; set; }

        [Input("bitrateValue")]
        public double? BitrateValue { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTableArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTableArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTableArgs();
    }
}
