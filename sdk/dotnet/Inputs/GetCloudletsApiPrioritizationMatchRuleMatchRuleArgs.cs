// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsApiPrioritizationMatchRuleMatchRuleInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("end")]
        public Input<int>? End { get; set; }

        [Input("matchUrl")]
        public Input<string>? MatchUrl { get; set; }

        [Input("matches")]
        private InputList<Inputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchInputArgs>? _matches;
        public InputList<Inputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchInputArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchInputArgs>());
            set => _matches = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("passThroughPercent", required: true)]
        public Input<double> PassThroughPercent { get; set; } = null!;

        [Input("start")]
        public Input<int>? Start { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetCloudletsApiPrioritizationMatchRuleMatchRuleInputArgs()
        {
        }
        public static new GetCloudletsApiPrioritizationMatchRuleMatchRuleInputArgs Empty => new GetCloudletsApiPrioritizationMatchRuleMatchRuleInputArgs();
    }
}
